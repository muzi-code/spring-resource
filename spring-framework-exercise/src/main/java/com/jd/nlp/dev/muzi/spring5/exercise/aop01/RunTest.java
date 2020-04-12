package com.jd.nlp.dev.muzi.spring5.exercise.aop01;

import com.jd.nlp.dev.muzi.spring5.exercise.aop01.service.BankService;
import com.jd.nlp.dev.muzi.spring5.exercise.demo12.FactoryB;
import com.jd.nlp.dev.muzi.spring5.exercise.demo12.FactoryBeanDemo;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开启Spring一个工程的方式
 * <p>
 * 代理对象debug一般类的描述是 $Proxyxxx@xxxx  那么这个类在哪里，这个是动态生成的类，在JVM内存中。
 * 并非是原被代理类，它是一个新的类。
 * <p>
 * 一个类中的方法如果有代理实例，那么这个代理是否会被Spring容器管理的呢？
 *      代理对象最后放入了IOC的一级缓存中，通过名称获取的bean是代理实例。
 * AOP的入口类是在哪里放入到Spring容器的？
 *      如果是通过 xml 启动容器，扫描
 *      <aop:aspectj-autoproxy proxy-target-class="false" expose-proxy="true"/>
 *      这个标签，走自定义标签解析流程，加载AOP的jar中的spring.handlers，nameSpaceURI找到handler。
 *
 *
 * 切面
 *      在spring中叫advisor
 *      "一类功能的增强"，比如日志切面，缓存切面，事务切面或某一项功能的切面。比如案例中的around方法代码就是一个切面。
 *
 * advisor
 *      pointCut
 *      pointCut决定切面作用在哪里，它是一类JoinPoint的集合，是切入点。（"execution(public * com.jd.nlp.dev.muzi.spring5.exercise.aop01.service.*.*(..))"）
 *      advice
 *      就是功能增强的方法，对目标对象方法进行增强，这个方法就是 advice。
 *      @Around("pc1()")
 *      public Object around(ProceedingJoinPoint joinPoint) throws Throwable
 *
 *      备注：pointCut决定拦截哪些类中的哪些方法，advice具体增强的内容。JoinPoint指的是拦截到的具体的某个方法。
 * 代理
 *      JDk中的动态代理，内存里面写一段代码，字符串拼凑一个类，写到java文件，编译字节码，通过类加载器加载到内存，创建一个代理对象。
 *      代理对象的eat方法就是 h.invoke ，这个h就是advice，最终调用到你实现InvocationHandler实现类中的invoke方法。
 *
 */
public class RunTest {


    @Test
    public void run01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring5/exercise/aop01/spring.xml"
        );

        BankService bankService = (BankService) context.getBean(BankService.class);
        bankService.queryArea("文本阈值查询");
        System.out.println();
    }

}
