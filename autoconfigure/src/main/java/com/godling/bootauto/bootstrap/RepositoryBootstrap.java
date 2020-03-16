package com.godling.bootauto.bootstrap;

import com.godling.bootauto.repository.MyRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with 87179
 * Description: 仓储引导类
 * Date: 2020-03-10
 * Time: 14:21
 * Project: bootauto
 *
 * @author 87179
 */
@ComponentScan(basePackages = "com.godling.bootauto.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        MyRepository myRepository = applicationContext.getBean("myRepository", MyRepository.class);
        System.out.println("myRepository is " + myRepository);
        //关闭上下文
        applicationContext.close();
    }
}
