package com.jd.nlp.dev.muzi.spring5.exercise.demo04;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * 第二个优先注入 Primary
 * 同一个接口有两个及以上primary 就必须指定注入的bean名称了 @Qualifier.
 * 不然会报错
 */
//@Primary
@Service
public class ThirdAccountService implements AccountService {

    private String name = "ThirdAccountService";

    @Override
    public void show() {
        System.out.println(name);
    }
}
