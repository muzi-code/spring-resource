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
        // 基于扫描注解的方式，启动spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanBean.class);

        System.out.println();
    }

}
