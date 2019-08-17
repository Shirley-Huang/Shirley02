package com.dandan.spring.context.loading.annotation;

import com.dandan.spring.context.model.Man;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dandan On 七月 29 2019
 */
public class AnnotationConfigApplicationContextTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyAnnotationConfig.class);
        Man man = context.getBean(Man.class);
        man.driveCar();

    }

}
