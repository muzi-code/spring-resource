package com.jd.nlp.dev.muzi.spring5.exercise.demo14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/common")
public class TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/index")
    @ResponseBody
    public void test01(){
        RequestSessionBean requestSessionBean = (RequestSessionBean) applicationContext.getBean("requestSessionBean");
        System.out.println(requestSessionBean);
    }

}
