package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.ClearEnvironmentVariable;
import org.junitpioneer.jupiter.SetEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AppleCalculatorTest {
    @Test
    @ClearEnvironmentVariable(key = "USERNAME")
    void setEnvironmentVariableTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertNull( appleCalculator.getEnvironmentVariable("USERNAME"));
    }
}