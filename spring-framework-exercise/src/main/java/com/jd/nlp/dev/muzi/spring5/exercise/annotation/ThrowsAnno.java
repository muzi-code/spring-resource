package com.jd.nlp.dev.muzi.spring5.exercise.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ThrowsAnno {
    String name() default "";
}
