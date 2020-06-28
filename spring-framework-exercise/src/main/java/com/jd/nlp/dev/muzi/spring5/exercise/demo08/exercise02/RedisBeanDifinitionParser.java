package com.jd.nlp.dev.muzi.spring5.exercise.demo08.exercise02;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

public class RedisBeanDifinitionParser extends
        AbstractSingleBeanDefinitionParser {
    
    protected Class<?> getBeanClass(Element element) {
        return Jedis.class;
    }
    
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String ip = element.getAttribute("ip");
        String port = element.getAttribute("port");
        String password = element.getAttribute("password");

        JedisShardInfo jedisShardInfo = new JedisShardInfo(ip,Integer.parseInt(port));
        jedisShardInfo.setPassword(password);

        builder.addConstructorArgValue(jedisShardInfo);
    }
}
