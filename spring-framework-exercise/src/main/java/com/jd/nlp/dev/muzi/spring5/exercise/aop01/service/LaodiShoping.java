package com.jd.nlp.dev.muzi.spring5.exercise.aop01.service;

import com.jd.nlp.dev.muzi.spring5.exercise.annotation.ReturnValue;
import com.jd.nlp.dev.muzi.spring5.exercise.annotation.TargetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaodiShoping implements ShopService {

    @Autowired
    UserService userService;

    @TargetMethod(name = "shop")
    @Override
    public void shop() {
        System.out.println("LaodiShoping -> shop");
    }

    @ReturnValue(name = "pick")
    @Override
    public int pick() {
        System.out.println("LaodiShoping -> pick");
        return 0;
    }
}
