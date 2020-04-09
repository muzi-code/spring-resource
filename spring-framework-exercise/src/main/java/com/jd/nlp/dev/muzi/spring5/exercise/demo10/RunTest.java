package com.jd.nlp.dev.muzi.spring5.exercise.demo10;

import com.jd.nlp.dev.muzi.spring5.exercise.demo10.model.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Spring一个工程的方式
 *
 */
public class RunTest {


    @Test
    public void run01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo10/spring.xml"
        );
        System.out.println("123");

        Student student = context.getBean(Student.class);
        System.out.println(student);

    }

}
