package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @Test
    void addApple(TestReporter reporter) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), " 1 apple + 1 apple is 2 apple ");
        reporter.publishEntry(" this test case is to assert Apple Calculator addition functionality ");
        reporter.publishEntry("1 apple + 1 apple is 2 apple");
    }
}