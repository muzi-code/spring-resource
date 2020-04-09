package com.jd.nlp.dev.muzi.spring5.exercise.demo07;

import com.jd.nlp.dev.muzi.spring5.exercise.demo06.OriginClass;
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
                "classpath:spring5/exercise/demo07/spring.xml"
        );

        DecoratorBean decoratorBean = (DecoratorBean)context.getBean("decoratorBean");
        System.out.println(decoratorBean.getUsername());
    }


}
