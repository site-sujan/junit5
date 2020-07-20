package com.example.junit5.sujan;

public class AppleCalculator {
    public int addApple(int apple1, int apple2) {
        return apple1 + apple2;
    }

    public boolean isApple(String appleName) {
        return "McIntosh".equalsIgnoreCase(appleName);
    }
}