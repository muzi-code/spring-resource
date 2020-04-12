package com.jd.nlp.dev.muzi.spring5.exercise.aop01;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

/*
* @Service会被@ComponentScan扫描到
* */
@Service
/*
* 开启注解AOP
* 替代了：<aop:aspectj-autoproxy/>
*
* spring boot EnableAspectJAutoProxy
* */
@EnableAspectJAutoProxy(proxyTargetClass = false,exposeProxy = true)
public class EnableAspectJAutoProxyBean {

}
