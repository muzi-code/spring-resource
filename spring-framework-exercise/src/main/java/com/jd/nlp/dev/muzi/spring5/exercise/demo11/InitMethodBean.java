package com.jd.nlp.dev.muzi.spring5.exercise.demo11;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * 如果需要在一个类实例化以后去做一些事情，那么就可以借助这个接口来完成
 */
public class InitMethodBean implements InitializingBean,BeanNameAware {

    @PostConstruct
    public void postConstruct() {
        System.out.println("========InitMethodBean.postConstruct()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("========InitMethodBean.afterPropertiesSet()");
    }

    public void initMethod() {
        System.out.println("========InitMethodBean.initMethod()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("========InitMethodBean.BeanNameAware：" + name);
    }
}
