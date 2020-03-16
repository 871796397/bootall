package com.godling.bootauto.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with 87179
 * Description: 注解方式
 * Date: 2020-03-11
 * Time: 23:41
 * Project: bootauto
 *
 * @author 87179
 */
@Configuration
public class SayShitConfiguration {

    @Bean
    public String sayShit() {
        return "shit everywhere....";
    }
}
