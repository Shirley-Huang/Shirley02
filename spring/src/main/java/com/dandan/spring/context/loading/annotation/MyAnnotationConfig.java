package com.dandan.spring.context.loading.annotation;

import com.dandan.spring.context.model.Car;
import com.dandan.spring.context.model.MaShaLaDiCar;
import com.dandan.spring.context.model.Man;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dandan On 七月 29 2019
 *
 * 像xml配置文件一样描述bean以及bean之间的依赖关系
 */
@Configuration
public class MyAnnotationConfig {

    @Bean
    public Man man(){
        return new Man(car());
    }

    @Bean
    public Car car() {
        return new MaShaLaDiCar();
    }


}



