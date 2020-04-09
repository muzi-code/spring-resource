package com.jd.nlp.dev.muzi.spring5.exercise.demo02;


import lombok.Data;

public class Son {

    private String name = "孩子业务类";

    private String age = "18";

    public void show(){
        System.out.println(name+"\n"+age);
    }

    public Son(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Son() {
    }

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
