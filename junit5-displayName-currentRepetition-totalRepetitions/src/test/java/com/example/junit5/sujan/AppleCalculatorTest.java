package com.example.junit5.sujan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition} of {totalRepetitions}")
    @DisplayName("Repetition")
    void addAppleTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }
}