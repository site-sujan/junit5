package com.example.junit5.sujan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.RepeatedTest.*;

class AppleCalculatorTest {
    @RepeatedTest(value = 5, name = LONG_DISPLAY_NAME)
    @DisplayName("Long Display Name")
    void addAppleTestCase1() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @RepeatedTest(value = 5, name = CURRENT_REPETITION_PLACEHOLDER)
    @DisplayName("Current Repetition Placeholder")
    void addAppleTestCase2() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @RepeatedTest(value = 5, name = DISPLAY_NAME_PLACEHOLDER)
    @DisplayName("Display Name Placeholder")
    void addAppleTestCase3() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @RepeatedTest(value = 5, name = SHORT_DISPLAY_NAME)
    @DisplayName("Short Display Name")
    void addAppleTestCase4() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @RepeatedTest(value = 5, name = TOTAL_REPETITIONS_PLACEHOLDER)
    @DisplayName("Total Repetitions Placeholder")
    void addAppleTestCase5() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }
}