package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.condition.OS.*;

class AppleCalculatorTest {

    @Test
    @EnabledOnOs(LINUX)
    void addAppleTestEnabledOnLinux() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @DisabledOnOs(WINDOWS)
    void addAppleTestEnabledOnWindows() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @EnabledOnOs({WINDOWS, MAC})
    void addAppleTestEnabledOnMultipleOs() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @DisabledOnOs({WINDOWS, MAC})
    void addAppleTestDisabledOnMultipleOs() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }
}