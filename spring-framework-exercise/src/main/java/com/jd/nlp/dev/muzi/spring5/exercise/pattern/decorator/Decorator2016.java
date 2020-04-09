package com.jd.nlp.dev.muzi.spring5.exercise.pattern.decorator;

public class Decorator2016 extends Decorator {

    public Decorator2016(House house) {
        super(house);
    }

    public void findWife() {
        TomHouse2001 tomHouse2001 = (TomHouse2001)house;
        tomHouse2001.getPeoples().add("老婆");
        System.out.println("=======2016Tom找到老婆结婚了");
    }

    @Override
    public void people() {
        //2001年的人都还在，Tom，老爸，老妈
        super.people();

        findWife();
    }

    public void addGoods() {
        TomHouse2001 tomHouse2001 = (TomHouse2001)house;
        tomHouse2001.getGoods().add("电视机");
        tomHouse2001.getGoods().add("电冰箱");
        System.out.println("=======2016Tom买了电视机、电冰箱");
    }

    @Override
    public void goods() {
        //2001年的手电筒还在
        super.goods();

        addGoods();
    }
}
