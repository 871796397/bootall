package com.godling.studyapplication;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with 87179
 * Description: Spring 应用事件引导类
 * Date: 2020-03-13
 * Time: 12:48
 * Project: bootall
 *
 * @author 87179
 */
public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {
        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册应用监听器
        context.addApplicationListener(event -> {
            System.out.println("监听到事件. " + event);
        });
        //启动上下文
        context.refresh();

        //发送事件
        context.publishEvent("fuck them");
        context.publishEvent("fuck them2");

        //自定义事件并发送
        context.publishEvent(new ApplicationEvent("holy shit") {
        });
        List<String> lists = CollUtil.newArrayList();
        for (String list : lists) {
            if (StrUtil.isNotBlank(list)) {
                System.out.println(list);
            }
        }
        //关闭上下文
        context.close();
    }
}
