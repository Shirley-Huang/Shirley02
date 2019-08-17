package com.dandan.spring.context.model;

import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dandan On 七月 29 2019
 *
 * Spring  的注解扫描默认是不开启的，需要配置显示的配置注解启动
 * Spring有两种开启注解扫描的方式
 * 1、Java注解
 * 2、XML配置文件
 */
@ComponentScan(basePackageClasses = MaShaLaDiCar.class)
public class CarConfig {

}
