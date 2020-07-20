package com.example.junit5.sujan;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyTestWatcher.class)
class AppleCalculatorTest {
    @Test
    void assertTrueTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTrue(appleCalculator.booleanApple("apple"));
    }

    @Test
    void assertFalseTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertFalse(appleCalculator.booleanApple("orange"));
    }

    @Test
    @Disabled
    void disabledTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertFalse(appleCalculator.booleanApple("apple"));
    }
}