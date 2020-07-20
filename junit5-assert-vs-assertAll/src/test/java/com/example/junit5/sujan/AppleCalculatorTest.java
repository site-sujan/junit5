package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class AppleCalculatorTest {
    @Test
    void addAppleAssertTest() {
        System.out.println("AppleCalculatorTest.addAppleTest");
        AppleCalculator appleCalculator = new AppleCalculator();
        Apple apple = appleCalculator.addApple(1, "apple");
        assertNotNull(apple, "apple object should not be null");
        assertEquals(1, apple.getAppleId(), "appleId should be 1");
        assertEquals("apple", apple.getAppleName(), "appleName should be apple");
    }

    @Test
    void addAppleAssertAllTest() {
        System.out.println("AppleCalculatorTest.addAppleTest");
        AppleCalculator appleCalculator = new AppleCalculator();
        Apple apple = appleCalculator.addApple(1, "apple");
        assertAll(() -> assertNotNull(apple, "apple object should not be null"),
                () -> assertEquals(1, apple.getAppleId(), "appleId should be 1"),
                () -> assertEquals("apple", apple.getAppleName(), "appleName should be apple"));
    }
}