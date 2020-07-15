package com.example.junit5.sujan;

import java.util.concurrent.TimeUnit;

public class AppleCalculator {
    public String getTimeout() throws InterruptedException {
        for (int value = 0; value < 10; value++) {
            System.out.println("AppleCalculator.getTimeout iteration:- " + value);
            TimeUnit.SECONDS.sleep(1);
        }
        return "apple";
    }
}