package com.jd.nlp.dev.muzi.spring5.exercise.aop02;

import com.jd.nlp.dev.muzi.spring5.exercise.aop01.service.UserService;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 开启Spring一个工程的方式
 *
 */
public class RunTest {


    @Test
    public void run01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com.jd.nlp.dev.muzi.spring5.exercise.aop02"
        );
        UserService userService = (UserService) context.getBean(UserService.class);
        userService.queryUser("123");
        System.out.println();
    }


}
