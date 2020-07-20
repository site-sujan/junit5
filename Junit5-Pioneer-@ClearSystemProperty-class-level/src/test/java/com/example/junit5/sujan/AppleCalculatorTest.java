package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.ClearSystemProperty;

import static org.junit.jupiter.api.Assertions.assertNull;

@ClearSystemProperty(key = "java.runtime.name")
class AppleCalculatorTest {
    @Test
    void clearSystemPropertyTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertNull(appleCalculator.clearSystemProperty("java.runtime.name"));
    }
}