package com.learn.springCore.service;

import org.springframework.stereotype.Component;

@Component
public class BasicChecker implements Checker{

    @Override
    public String check() {
        return "Basic checker";
    }
}
