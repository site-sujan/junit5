package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @RepeatedTest(5)
    void addAppleTest() {
        System.out.println("AppleCalculatorTest.addAppleTest");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @BeforeEach
    void setUp() {
        System.out.println("AppleCalculatorTest.setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AppleCalculatorTest.tearDown");
    }
}