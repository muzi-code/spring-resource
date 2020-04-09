package com.jd.nlp.dev.muzi.spring5.exercise.demo08.exercise01;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

@Component
public class TestBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
//        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//        genericBeanDefinition.setBeanClass(BeanClass.class);
//
////        genericBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue(null);
//
//        MutablePropertyValues propertyValues = genericBeanDefinition.getPropertyValues();
//        propertyValues.addPropertyValue("username","BeanClass user name Muzi Li");
//
//        registry.registerBeanDefinition("beanClass",genericBeanDefinition);


        // BeanDefinitionRegistry 新增 获取 beandefinition
        /**
         * 源码中也是new 一个ClassPathBeanDefinitionScanner
         */
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);
        /**
         * 源码中应该是某个父类方法进行操作IncludeFilter这个集合的
         */
        scanner.addIncludeFilter(new AnnotationTypeFilter(MyService.class));
        /**
         * 扫描package中的类
         */
        scanner.scan("com.jd.nlp.dev.muzi.spring5.exercise.demo08.exercise01");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        //
    }
}
