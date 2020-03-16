package com.godling.bootauto.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Created with 87179
 * Description: java 系统属性 条件判断
 * Date: 2020-03-12
 * Time: 12:47
 * Project: bootauto
 *
 * @author 87179
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * Java系统属性名称
     * @return
     */
    String name();


    /**
     * 系统属性值
     * @return
     */
    String value();
}
