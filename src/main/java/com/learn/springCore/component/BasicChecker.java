package com.learn.springCore.component;

import org.springframework.stereotype.Component;

@Component
public class BasicChecker implements Checker{

    @Override
    public String check() {
        return "Basic checker";
    }
}
