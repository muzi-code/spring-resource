package com.jd.nlp.dev.muzi.spring5.exercise.demo13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    @Autowired
    private CircularPrototypeA circularPrototypeA;
}
