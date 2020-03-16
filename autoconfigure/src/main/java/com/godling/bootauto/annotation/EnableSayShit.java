package com.godling.bootauto.annotation;

import com.godling.bootauto.configuration.SayShitSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created with 87179
 * Description: 自动装配demo2
 * Date: 2020-03-11
 * Time: 23:40
 * Project: bootauto
 *
 * @author 87179
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(SayShitSelector.class)
public @interface EnableSayShit {
}
