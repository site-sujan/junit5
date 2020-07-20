package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.SetSystemProperty;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @Test
    @SetSystemProperty(key = "java.specification.version", value = "1")
    void setSystemPropertyTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals("1", appleCalculator.setSystemProperty("java.specification.version"));
    }
}