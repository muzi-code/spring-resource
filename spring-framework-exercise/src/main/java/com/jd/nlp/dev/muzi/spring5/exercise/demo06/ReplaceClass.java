package com.jd.nlp.dev.muzi.spring5.exercise.demo06;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ReplaceClass implements MethodReplacer {


    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        System.out.println("I am replace method -> reimplement -> begin");
        System.out.println("obj:"+ obj.toString());
        System.out.println("method:" + method.getName());
        System.out.println("args:" + args);
        System.out.println("I am replace method -> reimplement -> end");
        return null;
    }
}
