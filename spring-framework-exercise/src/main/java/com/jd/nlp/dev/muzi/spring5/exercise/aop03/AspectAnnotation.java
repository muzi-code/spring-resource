package com.jd.nlp.dev.muzi.spring5.exercise.aop03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AspectAnnotation {

    /**
     * 这个方法可以理解为一组 joinPoint 的集合，切入点的集合。
     */
    @Pointcut("execution(public * com.jd.nlp.dev.muzi.spring5.exercise.aop03.*.*(..))")
    public void pc1(){}

    /**
     * 这个方法就叫做 advice 通知
     */
    @Around("pc1()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("==============AspectAnnotation around前置通知=========");
        Object result = joinPoint.proceed();
        System.out.println("==============AspectAnnotation around后置通知=========");
        return result;
    }

}
