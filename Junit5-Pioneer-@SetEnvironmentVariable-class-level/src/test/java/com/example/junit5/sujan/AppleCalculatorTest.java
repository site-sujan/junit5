package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.SetEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SetEnvironmentVariable(key = "USERNAME", value = "apple")
class AppleCalculatorTest {
    @Test
    void setEnvironmentVariableTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals("apple", appleCalculator.getEnvironmentVariable("USERNAME"));
    }
}