package com.jd.nlp.dev.muzi.spring5.exercise.aop02;

import com.jd.nlp.dev.muzi.spring5.exercise.aop01.service.UserService;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("userServiceImpl1")
public class UserServiceImpl1 implements UserService {

    @Override
    public String queryUser(String userId) {
        System.out.println("UserServiceImpl1 ->" + userId);
        return "UserServiceImpl1 ->" + userId;
    }

    @Override
    public void addxx(String id) {
        System.out.println("UserServiceImpl1 -> addxx");
    }
}
