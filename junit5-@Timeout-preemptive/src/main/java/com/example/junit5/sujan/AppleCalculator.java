package com.example.junit5.sujan;

import java.util.concurrent.TimeUnit;

public class AppleCalculator {
    public String getTimeout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        return "apple";
    }
}