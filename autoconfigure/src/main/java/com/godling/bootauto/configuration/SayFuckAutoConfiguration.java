package com.godling.bootauto.configuration;

import com.godling.bootauto.annotation.EnableSayFuck;
import com.godling.bootauto.annotation.EnableSayShit;
import com.godling.bootauto.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with 87179
 * Description: 自动装配
 * Date: 2020-03-11
 * Time: 23:41
 * Project: bootauto
 *
 * @author 87179
 */
//Spring 模式注解
@Configuration
// Spring @Enable 模块装配
@EnableSayShit
@EnableSayFuck
//条件装配
@ConditionalOnSystemProperty(name = "user.name", value = "87179")
public class SayFuckAutoConfiguration {

}
