package com.dandan.spring.context.assembly;

import com.dandan.spring.context.model.MaShaLaDiCar;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by dandan On 七月 29 2019
 *
 * @ContextConfiguration 上下文配置注解，指定配置文件的位置
 */

@RunWith(SpringJUnit4ClassRunner.class)//测试在Spring环境中运行
//@ContextConfiguration(classes = MaShaLaDiCar.class)//加载java配置类的方式  -失败
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")//加载xml配置文件的方式
public class AutoAssemblyBeanTest {

    /**
     * 自动化装配bean-即隐式装配bean
     * 由两个方面来实现
     * 1、组件扫描-通过开启组件扫描功能让Spring可以自动发现应用上下文中的bean
     * 2、自动装配-自动满足组件之间的依赖关系
     */

    @Autowired
    private MaShaLaDiCar maShaLaDiCar;

    @Test
    public void carTest(){
        Assert.assertNotNull(maShaLaDiCar);
        System.out.println("hello world");
    }

}
