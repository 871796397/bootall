package com.god.view.bootstrap;

import cn.hutool.core.io.FileUtil;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.BufferedInputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @program: bootall
 * @description: Thymeleaf 模板引擎引导类
 * @author: 曹凌
 * @create: 2020-03-20 11:10
 **/
public class ThymeleafEngineBootstrap {

    @lombok.SneakyThrows
    public static void main(String[] args) {
        //构建引擎
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        //创建渲染上下文
        Context context = new Context();
        context.setVariable("message","fuck this world");
        // 1. 模板内容  --- 编码模式
        String content = "<p th:text = \"${message}\">~~~~~</p>";
        // 2. 从classpath下读取 ResourceLoader
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:/templates/thymeleaf/shit.html");
        File file = resource.getFile();
        List<String> contentList = FileUtil.readLines(file, Charset.defaultCharset());
        content = String.join("", contentList);

        //渲染结果
        String process = springTemplateEngine.process(content, context);
        //输出渲染结果
        System.out.println(process);
    }
}
