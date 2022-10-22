package com.learn.springCore.scheduler;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Log4j2
public class PrintTimeScheduler {

    //TODO remove it to test scheduler
    //@Scheduled(fixedRate = 5000)
    public void reportCurrentDateTime(){
        log.info(Instant.now());
    }

    //@Scheduled(fixedRateString = "${fixedRate.in.milliseconds}")
    public void print(){
        log.info("-------------------");
    }
}
