package com.jd.nlp.dev.muzi.spring5.exercise.demo13;

import com.jd.nlp.dev.muzi.spring5.exercise.demo12.FactoryB;
import com.jd.nlp.dev.muzi.spring5.exercise.demo12.FactoryBeanDemo;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Spring一个工程的方式
 *
 * 非循环依赖的情况，都是可以支持注入的。循环依赖有些情况就不能注入。 下面主要是多例模式的循环依赖问题。
 *
 * prototype 类型每一次获取都是新的实例，根本没有放缓存。
 */
public class RunTest {


    @Test
    public void run01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo13/spring.xml"
        );

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                PrototypeBean p = (PrototypeBean) context.getBean("prototypeBean");
                System.out.println(p.hashCode());
            }, "thread-" + i).start();
        }

        Thread.yield();
    }

    @Test
    public void run02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo13/spring.xml"
        );

        /**
         * 多例模式的bean A 注入 单例模式的bean,单例模式的bean 注入 多例模式的bean A没有问题。
         * CircularPrototypeA autowired SingletonBean
         * SingletonBean autowired CircularPrototypeA
         * 没有问题
         */
        CircularPrototypeA circularPrototypeA = (CircularPrototypeA) context.getBean("circularPrototypeA");
        System.out.println(circularPrototypeA.hashCode());

        Thread.yield();

        /**
         * 多例模式的bean A 注入 多例模式的bean B
         * 但是
         * 多例模式的bean B 注入 多例模式的bean A
         * 就会抛出异常
         * CircularPrototypeA autowired CircularPrototypeB
         * CircularPrototypeB autowired CircularPrototypeA
         */
        CircularPrototypeB circularPrototypeB = (CircularPrototypeB) context.getBean("circularPrototypeB");
        System.out.println(circularPrototypeB.hashCode());
    }

}
