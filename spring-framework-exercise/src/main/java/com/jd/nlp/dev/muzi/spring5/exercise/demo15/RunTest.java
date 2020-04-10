package com.jd.nlp.dev.muzi.spring5.exercise.demo15;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 开启Spring一个工程的方式
 *
 */
public class RunTest {


    @Test
    public void run01(){
        // 基于类注解扫描的方式，启动spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanBean.class);

        System.out.println();
    }


    @Test
    public void run02(){
        // 基于注解扫描包的的方式，启动spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.jd.nlp.dev.muzi.spring5.exercise.demo15");

        System.out.println();
    }
}
