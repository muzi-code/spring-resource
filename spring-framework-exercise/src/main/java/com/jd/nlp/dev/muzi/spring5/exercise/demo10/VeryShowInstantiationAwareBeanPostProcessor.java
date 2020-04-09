package com.jd.nlp.dev.muzi.spring5.exercise.demo10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Service;


@Service
public class VeryShowInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        /**
         * 实现该类的postProcessAfterInstantiation可以使得项目无法进行依赖注入
         *
         * 基本不会用到，除非坏项目捣蛋
         */
        return false;
    }

}
