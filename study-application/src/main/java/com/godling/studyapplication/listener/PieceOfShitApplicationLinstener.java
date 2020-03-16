package com.godling.studyapplication.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Created with 87179
 * Description: 监听实现 {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 * Date: 2020-03-12
 * Time: 18:00
 * Project: bootall
 *
 * @author 87179
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class PieceOfShitApplicationLinstener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("shit at " + event.getTimestamp() + " this is " + event.getApplicationContext().getId());
    }
}
