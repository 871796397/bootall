package com.godling.studyapplication.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;

/**
 * Created with 87179
 * Description: 监听器实现 {@link SpringApplicationRunListener}
 * Date: 2020-03-13
 * Time: 12:59
 * Project: bootall
 *
 * @author 87179
 */
public class ShowPussyRunListener implements SpringApplicationRunListener {

    /**
     * 由于启动时,Spring 根据改构造器来创建其对象,所以该构造函数必须存在
     * @param application {@link SpringApplication}
     * @param args
     */
    public ShowPussyRunListener(SpringApplication application, String[] args) {
    }

    @Override
    public void starting() {
        System.out.println("pussy 0001");
    }
}
