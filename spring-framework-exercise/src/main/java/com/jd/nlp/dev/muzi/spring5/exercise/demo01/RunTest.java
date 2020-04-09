package com.jd.nlp.dev.muzi.spring5.exercise.demo01;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 开启Spring一个工程的方式
 */
public class RunTest {

    @Test
    public void run01(){
        // 基于加载XML配置文件的方式，启动spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring5/exercise/demo01/spring.xml");
        ProductService productService = (ProductService) context.getBean("product");
        productService.show();
    }

    @Test
    public void run02(){
        // 基于扫描注解的方式，启动spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.letwecode.muzi.spring5.exercise.demo01");
        ProductService productService = (ProductService) context.getBean("product");
        productService.show();
    }

    public void run03(){
        // 基本不用
        new FileSystemXmlApplicationContext("");
    }

    @Test
    public void test04(){
        // springboot在启动的时候会使用这个上下文来启动spring容器。new Tomcat 嵌入式tomcat
        // springboot 1.x.x 会有下面这个类
        // new EmbeddedWebApplicationContext();
    }

    @Test
    public void test01(){
        // 基于加载XML配置文件的方式，启动spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring5/exercise/demo01/spring.xml");
        ProductService productService = (ProductService) context.getBean("product");

        context.setAllowBeanDefinitionOverriding(true);
        context.setAllowCircularReferences(true);
        context.refresh();
        productService.show();
    }
}
