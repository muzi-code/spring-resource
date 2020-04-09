package com.jd.nlp.dev.muzi.spring5.exercise.demo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("kid")
public class Kid {

    @Autowired
    private Dog pet;

    private String name = "Tom Li";

    private String age = "18";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void showPet(){
        System.out.println(pet.getName());
    }

    public Dog getPet() {
        return pet;
    }

    public void setPet(Dog pet) {
        this.pet = pet;
    }
}
