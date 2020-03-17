package com.godling.web.servlet.support;

import com.godling.web.configuration.DispatcherServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @program: bootall
 * @description: Spring Web MVC 自动装配默认实现
 * @author: 曹凌
 * @create: 2020-03-17 13:54
 **/
public class DefalutAnnotationConfigDispatcherServletInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * web.xml  -  init-param
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }


    /**
     * DispatcherServlet
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DispatcherServletConfiguration.class};
    }

    /**
     * servlet-mapping servlet映射相关
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
