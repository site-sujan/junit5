package com.example.junit5.sujan;

import java.util.concurrent.TimeUnit;

public class AppleCalculator {
    public int addApple(int appleBag1, int appleBag2) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return appleBag1 + appleBag2;
    }
}