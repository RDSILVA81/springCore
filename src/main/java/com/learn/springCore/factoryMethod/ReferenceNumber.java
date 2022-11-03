package com.learn.springCore.factoryMethod;

import lombok.Getter;

@Getter
public class ReferenceNumber {

    private String positionOne;
    private String positionTwo;
    private String positionThree;

    private ReferenceNumber(String ... positions) {
        this.positionOne = positions[0];
        this.positionTwo = positions[1];
        this.positionThree = positions[2];
    }


    private static String[] splitReferenceNumber(String receivedReferenceNumber){
        return receivedReferenceNumber.split("-");
    }

    public static ReferenceNumber fromString(String receivedReferenceNumber) {
        return new ReferenceNumber(splitReferenceNumber(receivedReferenceNumber));
    }
}
