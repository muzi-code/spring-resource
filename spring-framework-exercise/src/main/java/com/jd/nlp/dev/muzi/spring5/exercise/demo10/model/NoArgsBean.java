package com.jd.nlp.dev.muzi.spring5.exercise.demo10.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Service
public class NoArgsBean {

    @Autowired
    private Student student;

    @PreDestroy
    public void destory(){
        System.out.println("NoArgsBean destory ");

    }

    @PostConstruct
    public void postConstructMethod(){
        System.out.println("NoArgsBean postConstructMethod ");
    }
}
