package com.learn.springCore.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class JobServiceImpl implements JobService{

    @Override
    public void doSomething() {
       log.info("Doing something ....................");
    }
}
