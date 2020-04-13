package com.jd.nlp.dev.muzi.spring5.exercise.aop03;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;


@Service
@EnableAspectJAutoProxy(proxyTargetClass = false,exposeProxy = true)
public class EnableAspectJAutoProxyBean {

}
