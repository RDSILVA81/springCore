package com.learn.springCore.factoryMethod;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println(Calculation.calcSum(1,2).getResult());
        System.out.println(Calculation.calcMultiply(2,2).getResult());
    }
}
