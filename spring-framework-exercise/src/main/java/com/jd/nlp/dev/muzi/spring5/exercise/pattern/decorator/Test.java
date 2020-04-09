package com.jd.nlp.dev.muzi.spring5.exercise.pattern.decorator;

public class Test {
    public static void main(String[] args) {
        House house = new TomHouse2001();
        System.out.println("2001情况");
        house.people();
        house.goods();
        System.out.println();
        System.out.println("2016情况");
        House house1 = new Decorator2016(house);
        house1.people();
        house1.goods();
        System.out.println();
        System.out.println("2017情况");
        House house2 = new Decorator2017(house);
        house2.people();
        house2.goods();
    }
}
