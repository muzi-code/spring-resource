package com.jd.nlp.dev.muzi.spring5.exercise.pattern.design;

public class TemplateChild02 extends TemplateFather {

    private String name = "小明";

    @Override
    public void love() {

        System.out.println(name + "的爱情，就像蓝天白云晴空万里");
    }

    @Override
    public void study(){
        System.out.println(name + "是学霸，爸妈再也不用操心我的学习");
    }
}
