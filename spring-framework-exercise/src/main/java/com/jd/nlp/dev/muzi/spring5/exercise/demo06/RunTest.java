package com.jd.nlp.dev.muzi.spring5.exercise.demo06;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * 开启Spring一个工程的方式
 */
public class RunTest {

    @Test
    public void run01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo06/spring.xml"
        );
        OriginClass originClass = (OriginClass)context.getBean("originClass");
        originClass.method("123123123");
        originClass.method(new ArrayList());
    }


}
