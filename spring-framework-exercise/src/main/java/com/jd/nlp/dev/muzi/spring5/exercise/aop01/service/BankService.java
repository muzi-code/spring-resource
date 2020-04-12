package com.jd.nlp.dev.muzi.spring5.exercise.aop01.service;

import java.util.List;

public interface BankService {

    public String queryBank(String bankId, Integer id, List list);

    public void queryArea(String areaId);

    public Object returnValue(String id);

    public void ThrowMethod(String id);
}
