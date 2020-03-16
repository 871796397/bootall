package com.godling.bootauto.bootstrap;

import com.godling.bootauto.service.PussyService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with 87179
 * Description: 测试配置实现
 * Date: 2020-03-12
 * Time: 0:15
 * Project: bootauto
 *
 * @author 87179
 */
@ComponentScan(basePackages = "com.godling.bootauto.service")
public class PussyServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(PussyServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);
        PussyService pussyService = applicationContext.getBean(PussyService.class);
        Integer sum = pussyService.sum(100, 200, 300, 400, 500, 600);
        System.out.println("真的能计算" + sum);
        applicationContext.close();
    }
}
