package com.jd.nlp.dev.muzi.spring5.exercise.demo01;


import org.springframework.stereotype.Service;

//@Service("product")
public class ProductService {

    private String name = "商品业务类";

    private String well = "开始Spring5的炫酷之旅，书生不读四书五经！";

    public void show(){
        System.out.println(name+"\n"+well);
    }
}
