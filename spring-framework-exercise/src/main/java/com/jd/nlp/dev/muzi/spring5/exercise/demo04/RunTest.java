package com.jd.nlp.dev.muzi.spring5.exercise.demo04;

import com.jd.nlp.dev.muzi.spring5.exercise.demo02.Parent;
import com.jd.nlp.dev.muzi.spring5.exercise.demo02.Son;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Spring一个工程的方式
 */
public class RunTest {

    @Test
    public void run01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo04/spring.xml"
        );
        UserAccount account = (UserAccount)context.getBean("userAccount");
        account.showAccount();
    }


}
