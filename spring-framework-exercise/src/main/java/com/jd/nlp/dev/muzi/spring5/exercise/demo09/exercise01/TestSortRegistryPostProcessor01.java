package com.jd.nlp.dev.muzi.spring5.exercise.demo09.exercise01;

import com.jd.nlp.dev.muzi.spring5.exercise.demo08.exercise01.BeanClass;
import com.jd.nlp.dev.muzi.spring5.exercise.demo08.exercise01.MyService;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

@Component
public class TestSortRegistryPostProcessor01 implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(BeanClass.class);

        MutablePropertyValues propertyValues = genericBeanDefinition.getPropertyValues();
        propertyValues.addPropertyValue("username","BeanClass user name Muzi Li");

        registry.registerBeanDefinition("beanClass",genericBeanDefinition);

        System.out.println("TestRegistryPostProcessor01 执行 postProcessBeanDefinitionRegistry");

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

    @Override
    public int getOrder() {
        /**
         * 数越小越优先
         */
        return 0;
    }
}
