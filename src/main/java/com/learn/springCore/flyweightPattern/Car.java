package com.learn.springCore.flyweightPattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Car {
    private String color;
    private Integer doors;
    private String brand;

    public Car(String color, Integer doors, String brand) {
        this.color = color;
        this.doors = doors;
        this.brand = brand;
    }


    public static final Car carOf(String color, Integer doors, String brand){
        return new Car(color,doors,brand);
    }


}
