package com.dandan.spring.context.model;

/**
 * Created by dandan On 七月 29 2019
 */
public class Man {

    private Car car;

    public Man(Car car){
        this.car = car;
    }


    public void driveCar() {
        System.out.println("drove a " + car.getClass().getSimpleName());
    }

}
