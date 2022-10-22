package com.learn.springCore.factoryMethod;

import lombok.Getter;

@Getter
public class Calculation {
    private Integer result;

    private Calculation(Integer result) {
        this.result = result;
    }

    public final static Calculation calcSum(int val1, int val2){
        return new Calculation(val1 + val2);
    }

    public final static Calculation calcMultiply(int val1, int val2){
        return new Calculation(val1 * val2);
    }

}
