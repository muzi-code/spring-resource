package com.jd.nlp.dev.muzi.spring5.exercise.demo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Dog {

    @Autowired
    @Qualifier("cat")
    private Cat friend;


    private String name = "花斑狗";

    private String age = "2";

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

    public void showFriend(){
        System.out.println(friend.getName());
    }


    public String initMethod(){
        System.out.println("init " + getName());
        return "";
    }

    public void desTmpMethod(){
        System.out.println("destory " + getName());
    }
}
