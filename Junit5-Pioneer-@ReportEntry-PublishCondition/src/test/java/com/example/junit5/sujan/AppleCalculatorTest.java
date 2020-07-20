package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.ReportEntry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junitpioneer.jupiter.ReportEntry.PublishCondition.ALWAYS;
import static org.junitpioneer.jupiter.ReportEntry.PublishCondition.ON_ABORTED;
import static org.junitpioneer.jupiter.ReportEntry.PublishCondition.ON_FAILURE;
import static org.junitpioneer.jupiter.ReportEntry.PublishCondition.ON_SUCCESS;

class AppleCalculatorTest {
    @Test
    @ReportEntry(key = "test case assert description ", value = "1 apple + 1 apple is 2 apple", when = ALWAYS)
    void addAppleAlwaysTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), " 1 apple + 1 apple is 2 apple ");
    }

    @Test
    @ReportEntry(key = "test case assert description ", value = "2 apple + 2 apple is 4 apple", when = ON_ABORTED)
    void addAppleOnAbortedTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assumeFalse("apple".equalsIgnoreCase(appleCalculator.getApple()));
        assertEquals(4, appleCalculator.addApple(2, 2), " 2 apple + 2 apple is 4 apple ");
    }

    @Test
    @ReportEntry(key = "test case assert description ", value = "3 apple + 3 apple is 6 apple", when = ON_FAILURE)
    void addAppleOnFailureTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.addApple(3, 3), " 3 apple + 3 apple is 1 apple ");
    }

    @Test
    @ReportEntry(key = "test case assert description ", value = "4 apple + 4 apple is 8 apple", when = ON_SUCCESS)
    void addAppleOnSuccessTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(8, appleCalculator.addApple(4, 4), " 4 apple + 4 apple is 8 apple ");
    }
}