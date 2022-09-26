package com.learn.springCore.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class AdvancedChecker implements Checker{
    @Override
    public String check() {
        return "Advanced checker";
    }
}
