package com.jd.nlp.dev.muzi.spring5.exercise.demo09;

import com.jd.nlp.dev.muzi.spring5.exercise.demo08.Tigger;
import com.jd.nlp.dev.muzi.spring5.exercise.demo08.exercise01.BeanClass;
import com.jd.nlp.dev.muzi.spring5.exercise.demo08.exercise01.MyAnnoClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * 开启Spring一个工程的方式
 */
public class RunTest {


    @Test
    public void run01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo09/spring.xml"
        );

        BeanClass beanClass = (BeanClass)context.getBean("beanClass");
        System.out.println(beanClass.getUsername());

    }



}
