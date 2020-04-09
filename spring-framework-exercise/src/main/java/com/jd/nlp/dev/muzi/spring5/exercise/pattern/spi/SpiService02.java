package com.jd.nlp.dev.muzi.spring5.exercise.pattern.spi;

public class SpiService02 implements SpiService {
    @Override
    public String query(String param) {
        System.out.println("SpiService02");
        return null;
    }
}
