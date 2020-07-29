package com.jd.nlp.dev.muzi.spring5.exercise.aop01.jdkproxy;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Advice implements InvocationHandler {

    People people;

    public Advice(People people) {
        this.people = people;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置增强
        before();

        //被代理方法
        Object value = method.invoke(people,args);

        //后置增强
        after();

        return value;
    }

    private void before() {
        System.out.println("===========代理前置通知，老弟吃饭之前需要洗手==========");
    }

    private void after() {
        System.out.println("===========代理后置通知，老弟吃完饭要洗碗=============");
    }
}
