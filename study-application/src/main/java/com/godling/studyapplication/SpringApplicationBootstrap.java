package com.godling.studyapplication;

import cn.hutool.core.collection.CollUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with 87179
 * Description: {@link org.springframework.boot.SpringApplication 引导类}
 * Date: 2020-03-12
 * Time: 17:07
 * Project: bootall
 *
 * @author 87179
 */

public class SpringApplicationBootstrap {
    public static void main(String[] args) {
//        SpringApplication.run(ApplicationConfiguration.class, args);
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(CollUtil.newHashSet(ApplicationConfiguration.class.getName()));
        ConfigurableApplicationContext run = springApplication.run(args);
        System.out.println("Bean is " + run.getBean(ApplicationConfiguration.class));
    }


    @SpringBootApplication
    public static class ApplicationConfiguration {
    }
}

