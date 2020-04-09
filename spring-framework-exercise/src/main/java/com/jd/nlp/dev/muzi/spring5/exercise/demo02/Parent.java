package com.jd.nlp.dev.muzi.spring5.exercise.demo02;


public class Parent {

    private String money = "1000";

    private String name = "父亲类";

    private String age = "48";

    public void show() {
        System.out.println(name + "\n" + age);
    }

    public Parent(String name) {
        this.name = name;
    }

    public Parent() {
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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
