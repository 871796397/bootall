package com.godling.bootauto;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BootautoApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BootautoApplication.class);
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.setAdditionalProfiles("prod");
        springApplication.setHeadless(true);
        new SpringApplicationBuilder(BootautoApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .profiles("prod")
                .web(WebApplicationType.NONE)
                .headless(true);
        SpringApplication.run(BootautoApplication.class, args);
    }

}
