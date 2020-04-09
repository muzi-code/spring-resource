package com.jd.nlp.dev.muzi.spring5.exercise.demo15;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@Import(TestConfigClass.class)
@ComponentScan(basePackages = {"com.xiangxue"})
public class ComponentScanBean {

//    @Bean
//    public void xx() {
//        System.out.println("==");
//    }
}
