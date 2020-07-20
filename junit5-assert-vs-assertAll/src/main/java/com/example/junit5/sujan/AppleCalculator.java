package com.example.junit5.sujan;

public class AppleCalculator {
    public Apple addApple(int appleId, String appleName ) {
        Apple apple = new Apple(appleId, appleName);
        return apple;
    }
}