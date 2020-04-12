package com.jd.nlp.dev.muzi.spring5.exercise.demo01;


import org.springframework.stereotype.Service;


@Service("product")
public class ProductService {

    private String name = "商品业务类";

    private String well = "开始Spring5的炫酷之旅，书生不读四书五经！";

    public void show(){
        System.out.println(name+"\n"+well);
    }

//    @Autowired
//    public ProductService(TmpField field){
//        this.name = "有参数构造函数 : 依赖对象 ：" + field.getName() ;
//    }

//    public ProductService(TmpField field1, TmpField field2){
//        this.name = "两个参数构造函数 : 依赖对象 ：" + field1.getName() ;
//    }

    public ProductService(){
        this.name = "无参数构造函数";
    }
}
