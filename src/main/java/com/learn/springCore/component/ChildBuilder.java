package com.learn.springCore.component;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ChildBuilder extends ParentBuilder {
    private final String childName;
    private final int childAge;
}
