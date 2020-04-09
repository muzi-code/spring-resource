package com.jd.nlp.dev.muzi.spring5.exercise.demo05;

public class Man implements People {
    private String name = "jack";

    private String six = "man";

    @Override
    public void showSix(){
        System.out.println(name + " : " + six);
    }
}
