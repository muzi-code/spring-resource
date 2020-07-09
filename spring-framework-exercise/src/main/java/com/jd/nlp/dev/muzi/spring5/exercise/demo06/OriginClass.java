package com.jd.nlp.dev.muzi.spring5.exercise.demo06;


import java.util.List;


public class OriginClass {

    /*
    * 这个方法需要进行业务功能增强，但是又不希望在原来基础上修改，可以用
    * replaced-method标签
    * */
    public void method(String param) {
        System.out.println();
        System.out.println("I am origin method! param = " + param);
        System.out.println();
    }

    public void method(List param) {
        System.out.println();
        System.out.println("I am origin method! param = " + param);
        System.out.println();
    }

}
