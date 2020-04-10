package com.jd.nlp.dev.muzi.spring5.exercise.demo16;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Spring一个工程的方式
 *
 * factoryB存在一个特有的容器中
 * factoryBeanDemo存在一级缓存中
 *
 * 通过factoryBeanDemo名称去得到内容，就算在一级缓存中拿到了，依然会走到获取factoryBean的内容。
 * 但是当名称前&符号则不会走到获取factoryBean的代码。
 */
public class RunTest {


    @Test
    public void run01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo16/spring.xml"
        );
        System.out.println();
    }

}
