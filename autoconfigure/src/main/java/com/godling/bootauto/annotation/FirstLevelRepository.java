package com.godling.bootauto.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * Created with 87179
 * Description: 一级 {@link Repository }
 * Date: 2020-03-10
 * Time: 14:14
 * Project: bootauto
 *
 * @author 87179
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {

    String value() default "";
}
