package com.godling.bootauto.repository;

import com.godling.bootauto.annotation.FirstLevelRepository;
import com.godling.bootauto.annotation.SecondLevelRepository;

/**
 * Created with 87179
 * Description: 测试注解
 * Date: 2020-03-10
 * Time: 14:20
 * Project: bootauto
 *
 * @author 87179
 */
@SecondLevelRepository(value = "myRepository")
public class MyRepository {
}
