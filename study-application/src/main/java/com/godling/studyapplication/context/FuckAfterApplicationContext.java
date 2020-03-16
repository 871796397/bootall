package com.godling.studyapplication.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * Created with 87179
 * Description: 自定义实现2
 * Date: 2020-03-12
 * Time: 17:49
 * Project: bootall
 *
 * @author 87179
 */
public class FuckAfterApplicationContext implements ApplicationContextInitializer<ConfigurableApplicationContext>
        , Ordered {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("FuckAfterApplicationContext's is " + applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
