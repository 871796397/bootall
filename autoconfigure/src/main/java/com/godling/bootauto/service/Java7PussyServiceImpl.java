package com.godling.bootauto.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created with 87179
 * Description: Java7实现
 * Date: 2020-03-12
 * Time: 0:11
 * Project: bootauto
 *
 * @author 87179
 */
@Service
@Profile("Java7")
public class Java7PussyServiceImpl implements PussyService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("使用Java7 进行的实现");
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        return sum;
    }
}
