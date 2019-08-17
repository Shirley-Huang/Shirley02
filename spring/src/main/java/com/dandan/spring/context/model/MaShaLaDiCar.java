package com.dandan.spring.context.model;

import org.springframework.stereotype.Component;

/**
 * Created by dandan On 七月 29 2019
 *
 * @Component 该注解标注的类即为Spring的组件类，Spring容器加载过程中会自动的为该类创建bean
 * Spring组件注解按照语义化的分类还有@Control @Repository @Service，分别作用于控制层、持久层、业务层
 */

@Component
public class MaShaLaDiCar implements Car {

    /**
     * 给接口的一个实现标注@Component注解，表明实现类是要被Spring创建实例的
     */


    public void drive() {
        System.out.println("drive a QQCar");
    }

}
