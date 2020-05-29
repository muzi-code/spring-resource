package com.jd.nlp.dev.muzi.spring5.exercise.demo05;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Spring一个工程的方式
 */
public class RunTest {

    @Test
    public void run01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring5/exercise/demo05/spring.xml");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.getName());
    }

    @Test
    public void run02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring5/exercise/demo05/spring.xml");
        ShowSixClass people = (ShowSixClass) context.getBean("people");
        people.getPeople().showSix();
        //people.showsix();
    }

}
