package com.jd.nlp.dev.muzi.spring5.exercise.pattern.design;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void run01(){
        System.out.println();
        TemplateFather template = new TemplateChild();
        template.childLife();
        System.out.println();
        TemplateFather template2 = new TemplateChild02();
        template2.childLife();
    }
}
