package com.jd.nlp.dev.muzi.spring5.exercise.demo15;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

@Service
@Import(TestConfigClass.class)
@ComponentScan(basePackages = {"com.jd.nlp.dev.muzi.spring5.exercise.demo15"})
@ImportResource("classpath:spring5/exercise/demo15/spring.xml")
public class ComponentScanBean {

//    @Bean
//    public void xx() {
//        System.out.println("==");
//    }
}
