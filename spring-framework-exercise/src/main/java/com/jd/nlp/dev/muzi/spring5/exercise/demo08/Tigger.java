package com.jd.nlp.dev.muzi.spring5.exercise.demo08;

import org.springframework.stereotype.Service;

//@Service("tigger")
public class Tigger {

    private String name = "tigger";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
