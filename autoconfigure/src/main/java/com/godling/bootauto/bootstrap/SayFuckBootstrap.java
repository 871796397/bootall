package com.godling.bootauto.bootstrap;

import com.godling.bootauto.annotation.EnableSayFuck;
import com.godling.bootauto.annotation.EnableSayShit;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with 87179
 * Description: 自动装配的测试
 * Date: 2020-03-11
 * Time: 23:43
 * Project: bootauto
 *
 * @author 87179
 */
@EnableSayShit
@EnableSayFuck
public class SayFuckBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(SayFuckBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //采用第一种方式进行的实现
        String sayFuck = applicationContext.getBean("sayFuck", String.class);
        System.out.println(sayFuck);

        String sayShit = applicationContext.getBean("sayShit", String.class);
        System.out.println(sayShit);
        applicationContext.close();
    }
}
