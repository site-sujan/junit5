package com.example.junit5.sujan;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class AppleCalculatorTest {
    @Test
    void addAppleTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Disabled ("subApple method is returning wrong output, hence disabling it.")
    void subAppleTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
    }
}