package com.jd.nlp.dev.muzi.spring5.exercise.pattern.entrust;

public class Boos implements Company {

    /**
     * 持有google的对象
     */
    Company google = new Google();


    @Override
    public void product() {
        /**
         * 产品生产委托给google
         */
        google.product();
    }
}
