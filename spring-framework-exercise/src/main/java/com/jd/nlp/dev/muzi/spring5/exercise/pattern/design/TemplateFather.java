package com.jd.nlp.dev.muzi.spring5.exercise.pattern.design;

public abstract class TemplateFather {



    public final void childLife(){
        study();
        work();

        // 子女的爱情不能干预
        love();
    }

    public void study(){
        System.out.println("学习要努力，至少得拿80分");
    }

    public void work(){
        System.out.println("工作要积极");
    }

    abstract public void love();
}
