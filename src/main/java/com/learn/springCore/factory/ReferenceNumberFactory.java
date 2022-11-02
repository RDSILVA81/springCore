package com.learn.springCore.factory;

public class ReferenceNumberFactory {

    private ReferenceNumberFactory() {
        throw new RuntimeException("Create a instance of this class is not allowed");
    }

    public static ReferenceNumber from(String receivedReferenceNumber){
        var result = splitReferenceNumber(receivedReferenceNumber);
        return ReferenceNumber.builder()
                .positionOne(result[0])
                .positionTwo(result[1])
                .positionThree(result[2])
                .build();
    }

    private static String[] splitReferenceNumber(String receivedReferenceNumber){
        return receivedReferenceNumber.split("-");
    }
}
