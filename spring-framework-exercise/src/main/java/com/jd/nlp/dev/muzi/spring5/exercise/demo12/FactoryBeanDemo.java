package com.jd.nlp.dev.muzi.spring5.exercise.demo12;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

@Service
public class FactoryBeanDemo implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new FactoryB();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryB.class;
    }
}
