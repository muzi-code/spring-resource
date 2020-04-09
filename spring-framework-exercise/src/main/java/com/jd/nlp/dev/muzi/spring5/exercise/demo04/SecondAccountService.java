package com.jd.nlp.dev.muzi.spring5.exercise.demo04;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 优先注入 Primary
 */
@Primary
@Service
public class SecondAccountService implements AccountService {

    private String name = "SecondAccountService";

    @Override
    public void show() {
        System.out.println(name);
    }
}
