package com.learn.springCore.factory;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class ReferenceNumber {
    private String positionOne;
    private String positionTwo;
    private String positionThree;
}
