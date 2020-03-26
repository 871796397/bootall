package com.god.view.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @program: bootall
 * @description: 配置类
 * @author: 曹凌
 * @create: 2020-03-20 16:49
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

//    @Bean
//    @ConditionalOnMissingBean
//    public InternalResourceViewResolver defaultViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix(this.mvcProperties.getView().getPrefix());
//        resolver.setSuffix(this.mvcProperties.getView().getSuffix());
//        return resolver;
//    }


    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setViewClass(JstlView.class);
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setOrder(Ordered.LOWEST_PRECEDENCE - 6);
        return internalResourceViewResolver;
    }

}
