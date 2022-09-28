package com.learn.springCore.controller;

import com.learn.springCore.component.Checker;
import com.learn.springCore.config.EmailConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@AllArgsConstructor
public class EmailController {
    private final Checker checker;
    private final EmailConfig config;
    @GetMapping("/check")
    public String checkEmail(){
        System.out.println(config.from());
        System.out.println(config.to());
        System.out.println(config.subject());
        System.out.println(config.password());
        return checker.check();
    }
}
