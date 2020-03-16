package com.godling.studyapplication.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created with 87179
 * Description: 在 {@link ConfigFileApplicationListener}之前
 * Date: 2020-03-13
 * Time: 13:19
 * Project: bootall
 *
 * @author 87179
 */
public class BeforeConfigApplicationListener implements Ordered, SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
        return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
                || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
    }

    @Override
    public int getOrder() {
        //这边的顺序其实就是Spring boot的实现顺序,所以需要扩展时,需要了解事件的优先级顺序
        return ConfigFileApplicationListener.DEFAULT_ORDER - 1;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ApplicationEnvironmentPreparedEvent) {
            ApplicationEnvironmentPreparedEvent preparedEvent = (ApplicationEnvironmentPreparedEvent) event;
            ConfigurableEnvironment environment = preparedEvent.getEnvironment();
            System.out.println("获取到的name是:, " + environment.getProperty("name"));
        }
        if (event instanceof ApplicationPreparedEvent) {
        }
    }
}
