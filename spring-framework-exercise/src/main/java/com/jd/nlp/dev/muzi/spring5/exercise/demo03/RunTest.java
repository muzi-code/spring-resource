package com.jd.nlp.dev.muzi.spring5.exercise.demo03;

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
        /**
         * autowire-candidate 测试 修改demo03的配置文件
         * dog 名叫花斑狗有个朋友小花猫
         * kid 有个宠物花斑狗
         *
         * dog的autowire-candidate如果设置为false 那么 kid就注入不了pet，但是不影响dog注入小花猫。
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring5/exercise/demo03/spring.xml");
        Kid kid = (Kid) context.getBean("kid");
        kid.showPet();
        kid.getPet().showFriend();
    }


    @Test
    public void run02(){
        /**
         * init method 和 destory method 测试
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring5/exercise/demo03/spring.xml");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.getName());
        context.close();
    }


}
