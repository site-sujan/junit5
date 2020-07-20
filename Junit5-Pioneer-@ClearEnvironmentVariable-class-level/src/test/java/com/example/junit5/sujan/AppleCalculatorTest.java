package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.ClearEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertNull;

@ClearEnvironmentVariable(key = "USERNAME")
class AppleCalculatorTest {
    @Test
    void setEnvironmentVariableTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertNull(appleCalculator.getEnvironmentVariable("USERNAME"));
    }
}