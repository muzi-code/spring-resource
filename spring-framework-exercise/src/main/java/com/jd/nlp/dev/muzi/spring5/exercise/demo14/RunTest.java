package com.jd.nlp.dev.muzi.spring5.exercise.demo14;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Spring一个工程的方式
 * <p>
 * 自定义的scop是可以注册的
 *
 * bean的作用域指的是什么？
 *  不同的bean的管理方式，单例 singletonObject ，factorybean 在 factoryBeanObjectCache 中，多例的没有缓存每次都重新创建，
 *  自定义scope类型的bean的是跟当前请求的线程有关的Map（request、session），根据当前线程ID拿到对应的Map中的session对象，从对象的Map里面拿对应的name，value值。
 *
 * 自定义的scope有什么用？
 *  其实就是在管理bean而已，如何去管理bean的对象而已。
 */
public class RunTest {


    @Test
    public void run01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo14/spring.xml"
        );

        /**
         * 会获取不到，需要WEB环境
         */
        RequestSessionBean requestSessionBean = (RequestSessionBean) context.getBean("requestSessionBean");
        System.out.println(requestSessionBean);
    }


    @Test
    public void run02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo14/spring.xml"
        );

        /**
         * 实现同一个线程 获取自定义Scope类型的bean获取多少次都是同一个
         * 不同线程获取到的自定义Scope类型的bean不同
         */
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                int count = 2;
                while (count > 0){

                    CustomScopeBean customScopeBean = (CustomScopeBean) context.getBean("customScopeBean");
                    System.out.println(Thread.currentThread().getName() + " : " + customScopeBean);
                    count--;
                }
            }, "thread-" + i).start();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
