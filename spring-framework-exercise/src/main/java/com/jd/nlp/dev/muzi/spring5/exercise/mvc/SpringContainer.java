package com.jd.nlp.dev.muzi.spring5.exercise.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@ComponentScan(value = "com.jd.nlp.dev.muzi.spring5.exercise.mvc", excludeFilters = {
        // 不扫描 Controller
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
})
public class SpringContainer {
}
