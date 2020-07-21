package com.example.junit5.sujan;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppleCalculatorTest {
    @ParameterizedTest
    @EnumSource
    void isAppleTest(AppleEnum appleName) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTrue(appleCalculator.isApple(appleName), "yes its an apple");
    }
}