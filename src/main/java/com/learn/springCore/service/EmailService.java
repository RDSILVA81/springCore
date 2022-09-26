package com.learn.springCore.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {
    private final Checker checker;

    public void emailChecker(){
        System.out.println(checker.check());
    }

}
