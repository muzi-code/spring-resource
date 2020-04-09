package com.jd.nlp.dev.muzi.spring5.exercise.demo13;

import com.jd.nlp.dev.muzi.spring5.exercise.demo11.CircularRefB;
import com.jd.nlp.dev.muzi.spring5.exercise.demo11.CircularRefC;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CircularPrototypeA {

    public CircularPrototypeA() {
        System.out.println("CircularPrototypeA() 无参数构造函数");
    }

//    @Autowired
//    private CircularPrototypeB circularPrototypeB;

    @Autowired
    private SingletonBean singletonBean;

    @Override
    public String toString() {
        return "CircularPrototypeA{" +
//                "circularPrototypeB=" +
//                (circularPrototypeB == null ? "null" : "circularPrototypeB")
//                +
                ", singletonBean=" +
                (singletonBean == null ? "null" : "singletonBean")
                +
                        '}';
    }
}
