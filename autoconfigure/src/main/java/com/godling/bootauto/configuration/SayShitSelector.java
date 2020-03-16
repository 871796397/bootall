package com.godling.bootauto.configuration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created with 87179
 * Description: 接口编程方式
 * Date: 2020-03-11
 * Time: 23:47
 * Project: bootauto
 *
 * @author 87179
 */
public class SayShitSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{SayShitConfiguration.class.getName()};
    }
}
