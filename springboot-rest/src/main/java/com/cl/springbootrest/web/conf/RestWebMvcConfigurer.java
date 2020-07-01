package com.cl.springbootrest.web.conf;

import com.cl.springbootrest.web.http.converter.properties.PropertiesHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @program: bootall
 * @description: 配置对象
 * @author: 曹凌
 * @create: 2020-06-30 11:33
 **/
@Configuration
public class RestWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(new PropertiesHttpMessageConverter());
        //可以在此处设置其优先级
        converters.add(0, new PropertiesHttpMessageConverter());
    }
}
