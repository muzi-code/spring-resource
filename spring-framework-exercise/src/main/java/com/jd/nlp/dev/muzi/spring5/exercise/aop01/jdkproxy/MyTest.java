package com.jd.nlp.dev.muzi.spring5.exercise.aop01.jdkproxy;

import java.lang.reflect.Proxy;

public class MyTest {
    public static void main(String[] args) {
        People proxyObject = (People)Proxy.newProxyInstance(MyTest.class.getClassLoader(), new Class<?>[]{People.class},
                new Advice(new Muzi()));

        proxyObject.eat("西瓜");
    }
}
