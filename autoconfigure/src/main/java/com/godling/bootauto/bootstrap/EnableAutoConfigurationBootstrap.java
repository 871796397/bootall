package com.godling.bootauto.bootstrap;

import com.godling.bootauto.service.PussyService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with 87179
 * Description: {@link EnableAutoConfiguration }自动装配引导类
 * Date: 2020-03-12
 * Time: 13:40
 * Project: bootauto
 *
 * @author 87179
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //采用第一种方式进行的实现
        String sayFuck = applicationContext.getBean("sayFuck", String.class);
        String sayShit = applicationContext.getBean("sayShit", String.class);
        System.out.println(sayFuck);
        System.out.println(sayShit);
        applicationContext.close();
    }
}
