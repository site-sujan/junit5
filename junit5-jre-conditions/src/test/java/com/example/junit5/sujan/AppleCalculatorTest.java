package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.condition.JRE.*;

class AppleCalculatorTest {

    @Test
    @EnabledOnJre(JRE.JAVA_14)
    void addAppleEnabledOnJreTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_8)
    void addAppleDisabledOnJreTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_13, JRE.JAVA_14})
    void addAppleEnabledOnMultipleJreTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @DisabledOnJre({JRE.JAVA_8, JAVA_9})
    void addAppleDisabledOnMultipleJreTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @EnabledForJreRange(min = JAVA_13, max = JAVA_15)
    void addAppleEnabledOnJreRangeTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @DisabledForJreRange(min = JAVA_8, max = JAVA_11)
    void addAppleDisabledOnJreRangeTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }
}