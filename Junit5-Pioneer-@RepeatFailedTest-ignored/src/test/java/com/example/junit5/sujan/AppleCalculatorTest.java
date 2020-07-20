package com.example.junit5.sujan;

import org.junitpioneer.jupiter.RepeatFailedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @RepeatFailedTest(15)
    void addApple() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(3, appleCalculator.getAppleCount(), "1 apple + 1 apple is 2 apple");
    }
}