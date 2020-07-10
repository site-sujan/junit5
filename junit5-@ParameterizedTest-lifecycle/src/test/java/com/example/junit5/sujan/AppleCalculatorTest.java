package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppleCalculatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"McIntosh", "Mango", "Fuji", "Orange", "Gala"})
    void isAppleTest(String appleName) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTrue(appleCalculator.isApple(appleName), "yes its an apple");
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