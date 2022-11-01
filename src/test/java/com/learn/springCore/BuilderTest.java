package com.learn.springCore;

import com.learn.springCore.component.ChildBuilder;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    void validate(){
        var childBuilder = ChildBuilder.builder()
                .childAge(11).childName("Child name").
                parentAge(50).parentName("Parent")
                .build();
        System.out.println(childBuilder.getChildName() + " : " + childBuilder.getChildAge());
        System.out.println(childBuilder.getParentName() + " : " + childBuilder.getParentAge());
    }
}
