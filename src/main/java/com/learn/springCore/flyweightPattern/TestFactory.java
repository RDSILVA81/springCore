package com.learn.springCore.flyweightPattern;

public class TestFactory {
    public static void main(String[] args) {
        FlyweightPatter.createCar("azul",3,"ford");
        FlyweightPatter.createCar("branco",3,"ford");
        FlyweightPatter.createCar("azul",4,"ford");
        FlyweightPatter.createCar("azul",3,"ford");
        FlyweightPatter.createCar("azul",3,"ford");
        FlyweightPatter.createCar("azul",3,"ford");
        FlyweightPatter.printCache();
    }
}
