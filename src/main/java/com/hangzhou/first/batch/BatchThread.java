package com.hangzhou.first.batch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BatchThread {

/*
    @Scheduled(fixedRate = 1000, initialDelay = 5000)
*/
    public void job() {
        System.out.println("job start....");
    }
}
