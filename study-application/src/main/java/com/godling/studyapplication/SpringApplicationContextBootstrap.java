package com.godling.studyapplication;

import cn.hutool.core.collection.CollUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with 87179
 * Description: Spring 应用上下文 引导类
 * Date: 2020-03-12
 * Time: 17:07
 * Project: bootall
 *
 * @author 87179
 */
@SpringBootApplication
public class SpringApplicationContextBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
//                .web(WebApplicationType.NONE)
                .run(args);
        //如果是 WEB 容器:结果是:AnnotationConfigServletWebServerApplicationContext ,StandardServletEnvironment
        //如果是非Web容器:AnnotationConfigApplicationContext , StandardEnvironment
        System.out.println("ConfigurableApplicationContext 类型" + context.getClass().getName());
        System.out.println("Environment 类型" + context.getEnvironment().getClass().getName());
        //关闭上下文
        context.close();
    }
}

