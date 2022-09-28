package com.learn.springCore.controller;

import com.learn.springCore.entity.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public MessageResponse getMessage(@RequestParam(required = false, defaultValue = "world") String name){
        return MessageResponse.builder().id(1).content(String.format("Hello %s !", name)).build();
    }
}
