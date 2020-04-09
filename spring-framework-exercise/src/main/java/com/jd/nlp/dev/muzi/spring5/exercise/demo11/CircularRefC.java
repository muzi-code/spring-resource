package com.jd.nlp.dev.muzi.spring5.exercise.demo11;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class CircularRefC {

    public CircularRefC() {
        System.out.println("CircularRefC() 无参数构造函数");
    }

    @Autowired
    private CircularRefA circularRefA;

    @Override
    public String toString() {
        return "CircularRefC{" +
                "circularRefA=" +
                (circularRefA == null ? "null" : "circularRefA")
                +
                '}';
    }
}
