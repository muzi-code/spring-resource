package com.jd.nlp.dev.muzi.spring5.exercise.demo05;


public class Woman implements People {

    private String name = "rose";

    private String six = "woman";

    @Override
    public void showSix(){
        System.out.println(name + " : " + six);
    }
}
