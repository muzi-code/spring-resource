package com.jd.nlp.dev.muzi.spring5.exercise.aop02;

import org.springframework.aop.framework.autoproxy.target.AbstractBeanFactoryBasedTargetSourceCreator;
import org.springframework.aop.target.AbstractBeanFactoryBasedTargetSource;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyTargetSourceCreator extends AbstractBeanFactoryBasedTargetSourceCreator {
    @Override
    protected AbstractBeanFactoryBasedTargetSource createBeanFactoryBasedTargetSource(Class<?> beanClass, String beanName) {

        if (getBeanFactory() instanceof ConfigurableListableBeanFactory) {
            BeanDefinition definition =
                    ((ConfigurableListableBeanFactory) getBeanFactory()).getBeanDefinition(beanName);

            if(beanName.equalsIgnoreCase("userServiceImpl1")) {
                MyTargetSource myTargetSource = new MyTargetSource();
                myTargetSource.setTargetBeanName("userServiceImpl1");
                try {
                    myTargetSource.setTargetClass(Class.forName(definition.getBeanClassName()));
                }catch (Exception e){
                    e.printStackTrace();
                }

                myTargetSource.setBeanFactory(getBeanFactory());
                return myTargetSource;
            }
        }

        return null;
    }
}
