package com.jd.nlp.dev.muzi.spring5.exercise.demo03;

public class DogFactory {

    public Dog factoryMethod(){
        Dog dog = new Dog();
        dog.setName("花斑狗");
        dog.setAge("19");
        System.out.println("factoryMethod res");
        return dog;
    }
}
