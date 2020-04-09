package com.jd.nlp.dev.muzi.spring5.exercise.pattern.decorator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/*
* MyHouse2001是被装饰对象，后续装饰者对该对象进行修改装饰
* */
@Data
public class TomHouse2001 implements House {

    private List<String> peoples = new ArrayList<>();

    private List<String> goods = new ArrayList<>();

    @Override
    public void people() {
        peoples.add("老爸");
        peoples.add("老妈");
        peoples.add("Jack");
        System.out.println("=======2001年Tom家里只有老爸，老妈和Tom");
    }

    @Override
    public void goods() {
        goods.add("手电筒");
        System.out.println("=======2001年Tom家里只有一个手电筒");
    }
}
