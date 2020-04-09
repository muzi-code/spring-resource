package com.jd.nlp.dev.muzi.spring5.exercise.demo04;

import org.springframework.stereotype.Service;


@Service
public class FirstAccountService implements AccountService {

    private String name = "FirstAccountService";

    @Override
    public void show() {
        System.out.println(name);
    }
}
