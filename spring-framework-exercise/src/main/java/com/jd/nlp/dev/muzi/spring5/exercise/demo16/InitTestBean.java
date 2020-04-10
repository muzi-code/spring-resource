package com.jd.nlp.dev.muzi.spring5.exercise.demo16;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class InitTestBean implements InitializingBean {

    public String initMethod(){
        System.out.println("initMethod ");
        return "";
    }

    @PostConstruct
    public void initPostConstruct(){
        System.out.println("initPostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
