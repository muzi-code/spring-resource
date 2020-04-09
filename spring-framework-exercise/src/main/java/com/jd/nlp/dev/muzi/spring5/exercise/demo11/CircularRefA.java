package com.jd.nlp.dev.muzi.spring5.exercise.demo11;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Data
@Service
public class CircularRefA {

    public CircularRefA() {
        System.out.println("CircularRefA() 无参数构造函数");
    }

    @Autowired
    private CircularRefB circularRefB;

    @Autowired
    private CircularRefC circularRefC;

    @Override
    public String toString() {
        return "CircularRefA{" +
                "circularRefB=" +
                (circularRefB == null ? "null" : "circularRefB")
                +
                ", circularRefC=" +
                (circularRefC == null ? "null" : "circularRefC")
                +
                '}';
    }
}
