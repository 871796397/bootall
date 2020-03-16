package com.godling.bootauto.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created with 87179
 * Description: Java8实现
 * Date: 2020-03-12
 * Time: 0:11
 * Project: bootauto
 *
 * @author 87179
 */
@Service
@Profile("Java8")
public class Java8PussyServiceImpl implements PussyService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("使用Java8 进行的实现");
        return Arrays.stream(values).reduce(0, Integer::sum);
    }
}
