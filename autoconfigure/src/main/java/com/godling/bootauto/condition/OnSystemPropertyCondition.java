package com.godling.bootauto.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * Created with 87179
 * Description: condition实现
 * Date: 2020-03-12
 * Time: 12:49
 * Project: bootauto
 *
 * @author 87179
 */
public class OnSystemPropertyCondition implements Condition {
    /**
     *
     * @param context
     * @param metadata {@link AnnotatedTypeMetadata 注解的元信息,就是注解中标注的一些信息}
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attaMap =
                metadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String propertyName = String.valueOf(attaMap.get("name"));
        String propertyValue = String.valueOf(attaMap.get("value"));
        String javaPropertyValue  = System.getProperty(propertyName);
        return propertyValue.equalsIgnoreCase(javaPropertyValue);
    }
}
