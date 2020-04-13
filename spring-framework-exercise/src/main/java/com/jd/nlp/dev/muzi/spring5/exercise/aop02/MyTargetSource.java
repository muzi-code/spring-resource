package com.jd.nlp.dev.muzi.spring5.exercise.aop02;

import org.springframework.aop.target.AbstractBeanFactoryBasedTargetSource;

public class MyTargetSource extends AbstractBeanFactoryBasedTargetSource {
    @Override
    public Object getTarget() throws Exception {
        return getBeanFactory().getBean(getTargetBeanName());
    }
}
