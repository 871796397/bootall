package com.godling.studyapplication.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Created with 87179
 * Description: 自定义实现
 * Date: 2020-03-12
 * Time: 17:46
 * Project: bootall
 *
 * @author 87179
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class MotherFuckerApplicationContext implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ConfigurableApplicationContext's Id , " + applicationContext.getId());
    }
}
