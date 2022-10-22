package com.learn.springCore.scheduler;

import com.learn.springCore.service.JobService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@AllArgsConstructor
public class SimpleJob implements Job {

    private final JobService jobService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
       log.info("Executing the job");
       jobService.doSomething();
    }
}
