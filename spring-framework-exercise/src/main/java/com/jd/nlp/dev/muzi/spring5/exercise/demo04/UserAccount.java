package com.jd.nlp.dev.muzi.spring5.exercise.demo04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userAccount")
public class UserAccount {

    @Autowired
    private AccountService accountService;

    public void showAccount(){
        accountService.show();
    }
}
