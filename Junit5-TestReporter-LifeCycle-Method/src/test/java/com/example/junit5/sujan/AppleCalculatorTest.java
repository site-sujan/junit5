package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppleCalculatorTest {
    @AfterAll
    static void afterAll(TestReporter reporter) {
        reporter.publishEntry(" AppleCalculatorTest.afterAll ");
    }

    @BeforeAll
    static void beforeAll(TestReporter reporter) {
        reporter.publishEntry(" AppleCalculatorTest.beforeAll ");
    }

    @BeforeEach
    void setUp(TestReporter reporter) {
        reporter.publishEntry(" AppleCalculatorTest.setUp ");
    }

    @AfterEach
    void tearDown(TestReporter reporter) {
        reporter.publishEntry(" AppleCalculatorTest.tearDown ");
    }

    @Test
    void addApple(TestReporter reporter) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), " 1 apple + 1 apple is 2 apple ");
        reporter.publishEntry("1 apple + 1 apple is 2 apple ");
    }

    @ParameterizedTest
    @ValueSource(strings = {"McIntosh"})
    void isAppleTest(String appleName, TestReporter reporter) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTrue(appleCalculator.isApple(appleName), " yes its an apple ");
        reporter.publishEntry(" yes " + appleName + " an apple ");
    }
}