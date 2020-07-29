package com.jd.nlp.dev.muzi.spring5.exercise.aop01.jdkproxy;

public class Muzi implements People {
    @Override
    public String eat(String param) {
        System.out.println("=========老弟正在吃" + param + "=======");
        return "=========老弟比较喜欢吃东西=======";
    }

    @Override
    public String show() {
        System.out.println("haha");
        return null;
    }
}
