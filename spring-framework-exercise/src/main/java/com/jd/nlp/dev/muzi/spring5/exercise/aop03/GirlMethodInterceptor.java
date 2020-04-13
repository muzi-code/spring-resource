package com.jd.nlp.dev.muzi.spring5.exercise.aop03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Service;

@Service("girlMethodInterceptor")
public class GirlMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("专门拦路拦截漂亮妹妹！！");
        return invocation.proceed();
    }
}
