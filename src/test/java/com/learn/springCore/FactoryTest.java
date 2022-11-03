package com.learn.springCore;

import com.learn.springCore.factoryMethod.ReferenceNumber;
import com.learn.springCore.factoryMethod.SingletonFactory;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    void createObjectSuccess(){
        var result =ReferenceNumber.fromString("1234-2222-3333");
        System.out.println(result.getPositionOne());
        System.out.println(result.getPositionTwo());
        System.out.println(result.getPositionThree());
    }

    @Test
    void singletonTest(){
        var result1 = SingletonFactory.getInstance();
        var result2 = SingletonFactory.getInstance();
        var result3 = SingletonFactory.getInstance();
    }
}
