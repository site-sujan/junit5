package com.example.junit5.sujan;

import java.util.concurrent.TimeUnit;

public class AppleCalculator {
    public String getTimeout() throws InterruptedException {
        System.out.println("AppleCalculator.getTimeout ThreadId:- " + Thread.currentThread().getId() + " ThreadName:- " + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(10);
        return "apple";
    }
}