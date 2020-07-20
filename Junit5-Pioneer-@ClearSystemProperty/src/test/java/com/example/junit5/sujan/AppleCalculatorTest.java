package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.ClearSystemProperty;

import static org.junit.jupiter.api.Assertions.assertNull;

class AppleCalculatorTest {
    @Test
    @ClearSystemProperty(key = "java.runtime.name")
    void clearSystemPropertyTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertNull(appleCalculator.clearSystemProperty("java.runtime.name"));
    }
}