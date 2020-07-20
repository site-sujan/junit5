package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @Test
    void addApple(TestReporter reporter) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), " 1 apple + 1 apple is 2 apple ");
        Map<String, String> descriptionMap = new HashMap<>();
        descriptionMap.put("test case description", " this test case is to assert Apple Calculator addition functionality ");
        descriptionMap.put("test case assert description ", "1 apple + 1 apple is 2 apple");
        reporter.publishEntry(descriptionMap);
    }
}