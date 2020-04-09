package com.jd.nlp.dev.muzi.spring5.exercise.demo02;

import com.jd.nlp.dev.muzi.spring5.exercise.demo01.ProductService;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring5/exercise/demo02/spring.xml");
        Son son = (Son) context.getBean("son");
        son.show();


//        Parent parent = (Parent) context.getBean("parent");
//        parent.show();
    }


}
