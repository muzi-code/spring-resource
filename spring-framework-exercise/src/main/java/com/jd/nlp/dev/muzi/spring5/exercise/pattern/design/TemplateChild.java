package com.jd.nlp.dev.muzi.spring5.exercise.pattern.design;

public class TemplateChild extends TemplateFather {

    private String name = "张三";

    @Override
    public void love() {
        System.out.println(name + "的爱情，来得太快就像一阵风");
    }
}
