package com.godling.bootauto.bootstrap;

import com.godling.bootauto.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created with 87179
 * Description: 系统判断启动
 * Date: 2020-03-12
 * Time: 12:52
 * Project: bootauto
 *
 * @author 87179
 */

public class SystemPropertyConditionBootstrap {

    /**
     * 通过注解:{@link ConditionalOnSystemProperty 来判断 从而进行创建对象}
     *
     * @return
     */
    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "87179")
    public String sayFuck() {
        return "fuck fuck fuck";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new SpringApplicationBuilder(SystemPropertyConditionBootstrap.class)
                        .web(WebApplicationType.NONE)
                        .run(args);
        //通过名称获取创建的bean
        String sayFuck = applicationContext.getBean("sayFuck", String.class);
        System.out.println(sayFuck);
        applicationContext.close();
    }

}
