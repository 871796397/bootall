package com.godling.overwrite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ServletComponentScan(basePackages = "com.cl.study.web.servlet")
@SpringBootApplication
public class StudyBootApplication {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(StudyBootApplication.class)
//                .web(WebApplicationType.NONE)
//                .run(args);
        SpringApplication.run(StudyBootApplication.class, args);
    }

}
