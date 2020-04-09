package com.jd.nlp.dev.muzi.spring5.exercise.pattern.spi;

public class SpiService01 implements SpiService {
    @Override
    public String query(String param) {
        System.out.println("SpiService01");
        return "OK";
    }
}
