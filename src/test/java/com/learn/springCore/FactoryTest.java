package com.learn.springCore;

import com.learn.springCore.factory.ReferenceNumberFactory;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    void createObjectSuccess(){
        var referenceNUmber = ReferenceNumberFactory.from("1234-22222-33333");
        System.out.println(referenceNUmber.toString());
    }
}
