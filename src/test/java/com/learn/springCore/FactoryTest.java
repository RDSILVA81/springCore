package com.learn.springCore;

import com.learn.springCore.factory.ReferenceNumber;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    void createObjectSuccess(){
        var result =ReferenceNumber.fromString("1234-2222-3333");
        System.out.println(result.getPositionOne());
        System.out.println(result.getPositionTwo());
        System.out.println(result.getPositionThree());
    }
}
