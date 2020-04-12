package com.jd.nlp.dev.muzi.spring5.exercise.demo01;

import org.springframework.stereotype.Service;

@Service("cat")
public class TmpField {

    private String name = "小花猫";

    private String age = "1";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
