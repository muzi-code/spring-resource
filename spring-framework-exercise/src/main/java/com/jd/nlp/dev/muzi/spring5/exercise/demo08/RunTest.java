package com.jd.nlp.dev.muzi.spring5.exercise.demo08;

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


    /**
     * <context:component-scan />
     * 自定义标签扫描流程
     *  先解析标签头 然后解析对应的namespace-uri  通过头找到对应的uri的继承了NamespaceHandler处理类
     *
     *  处理类先调用init方法建立 component-scan 和 解析类（parser）的映射。
     *
     *  接下来 在解析自定义标签时根据 componenr-scan 找到解析类并调用 parser的方法完成标签的解析。
     */
    @Test
    public void run01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo08/spring.xml"
        );

        Tigger tigger = (Tigger)context.getBean("tigger");
        System.out.println(tigger.getName());

    }


    @Test
    public void run02(){
        /**
         * 测试自定义注解扫描
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo08/spring.xml"
        );

        MyAnnoClass myAnnoClass = context.getBean(MyAnnoClass.class);
        System.out.println(" 测试自定义注解扫描: " + myAnnoClass.getUsername());

        BeanClass beanClass = context.getBean(BeanClass.class);
        System.out.println(" 测试动态注册BeanDefinition: " + beanClass.getUsername());
    }

    @Test
    public void run03(){
        ApplicationContext app = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/demo08/spring.xml");
        System.out.println(app);

        Jedis client1 = (Jedis)app.getBean("redis");
        System.out.println(client1);

        System.out.println(client1.set("keyname1", "valuejack1"));
    }

}
