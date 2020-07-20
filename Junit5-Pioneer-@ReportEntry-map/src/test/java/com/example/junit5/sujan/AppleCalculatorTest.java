package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.junitpioneer.jupiter.ReportEntry;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @Test
    @ReportEntry(key = "test case description ", value = " this test case is to assert Apple Calculator addition functionality ")
    @ReportEntry(key = "test case assert description ", value = "1 apple + 1 apple is 2 apple")
    void addApple(TestReporter reporter) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), " 1 apple + 1 apple is 2 apple ");
    }
}