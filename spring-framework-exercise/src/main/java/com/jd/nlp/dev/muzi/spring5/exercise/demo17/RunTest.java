package com.jd.nlp.dev.muzi.spring5.exercise.demo17;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 开启Spring一个工程的方式
 */
public class RunTest {

    @Test
    public void run01(){
        // 基于加载XML配置文件的方式，启动spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring5/exercise/demo17/spring.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        productService.show();
    }

}
