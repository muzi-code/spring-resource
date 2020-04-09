package com.jd.nlp.dev.muzi.spring5.exercise.demo13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CircularPrototypeB {

    public CircularPrototypeB() {
        System.out.println("CircularPrototypeB() 无参数构造函数");
    }

    @Autowired
    private CircularPrototypeA circularPrototypeA;

    @Override
    public String toString() {
        return "CircularPrototypeB{" +
                "circularRefB=" +
                (circularPrototypeA == null ? "null" : "circularPrototypeA")
                +
                '}';
    }
}
