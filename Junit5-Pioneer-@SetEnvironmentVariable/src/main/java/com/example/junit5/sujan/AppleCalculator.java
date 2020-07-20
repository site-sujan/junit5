package com.example.junit5.sujan;

public class AppleCalculator {
    public String getEnvironmentVariable(String key) {
        String property = System.getenv(key);
        return property;
    }
}