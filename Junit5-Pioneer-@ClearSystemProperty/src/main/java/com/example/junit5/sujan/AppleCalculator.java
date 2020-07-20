package com.example.junit5.sujan;

public class AppleCalculator {
    public String clearSystemProperty(String key) {
        String property = System.getProperty(key);
        return property;
    }
}