package com.jd.nlp.dev.muzi.spring5.exercise.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/*
 * servlet 启动会调用 init 方法
 *
 */
public class WebAppInitialzer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*
     * Spring 容器 不扫描Controller
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringContainer.class};
    }

    /*
     * SpringMvc 容器 只扫描Controller
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcContainer.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        return super.getServletFilters();
    }
}
