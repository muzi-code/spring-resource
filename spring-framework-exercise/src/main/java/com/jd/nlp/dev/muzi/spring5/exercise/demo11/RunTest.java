package com.jd.nlp.dev.muzi.spring5.exercise.demo11;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Spring一个工程的方式
 *
 * 循环依赖问题，只有单例非构造函数的实例化方式才支持循环依赖。
 * 默认通过无参数构造函数实例化，然后循环依赖通过属性的方式注入。
 * 其他的非单例，或者构造函数实例化都不支持循环依赖（循环依赖，构造函数的参数哪里来？都没创建好，当然不支持）。
 *
 * 案例描述：
 * A 引用了 B C
 * B 引用了A
 * C 引用了A
 *
 */
public class RunTest {


    @Test
    public void run01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo11/spring.xml"
        );
        System.out.println();

    }

}
