package com.jd.nlp.dev.muzi.spring5.exercise.pattern.decorator;

public class Decorator2017 extends Decorator2016 {

    public Decorator2017(House house) {
        super(house);
    }

    public void hasBaby() {
        TomHouse2001 tomHouse2001 = (TomHouse2001)house;
        tomHouse2001.getPeoples().add("baby");
        System.out.println("=======2017Tom有了一个baby");
    }

    @Override
    public void people() {
        //在2016基础上再装饰，生了一个小孩
        super.people();

        hasBaby();
    }

    public void addkongtiao() {
        TomHouse2001 tomHouse2001 = (TomHouse2001)house;
        tomHouse2001.getGoods().add("空调");
        System.out.println("=======2017Tom装了空调");
    }

    @Override
    public void goods() {
        //在2016基础上再装饰，装了空调
        super.goods();

        addkongtiao();
    }
}
