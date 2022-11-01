package com.learn.springCore.component;

import lombok.Getter;
import lombok.experimental.SuperBuilder;
@Getter
@SuperBuilder
public abstract class ParentBuilder {
    private final String parentName;
    private final int parentAge;
}
