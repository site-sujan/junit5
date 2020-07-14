package com.example.junit5.sujan;

import java.util.Objects;

public class AppleCalculator {
    public Apple getError(Apple apple) {
        if (Objects.isNull(apple)) {
            throw new NullPointerException("apple cannot be null");
        }
        return apple;
    }
}