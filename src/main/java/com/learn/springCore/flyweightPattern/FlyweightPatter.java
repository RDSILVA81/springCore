package com.learn.springCore.flyweightPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FlyweightPatter {

    private static Map<Integer, Car> carMap = new HashMap();

    private FlyweightPatter() {
    }

    public static final Car createCar(String color, Integer doors, String brand){
        var newCar = carMap.computeIfAbsent(hashCode(color,doors,brand), createCar -> {return Car.carOf(color,doors, brand);});
        System.out.println("carMap size = " + carMap.size());
        return newCar;
    }

    private static Integer hashCode(String color, Integer doors, String brand) {
        return Objects.hash(color, doors, brand);
    }

    public static void printCache(){
        System.out.println(carMap);
    }
}
