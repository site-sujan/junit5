package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppleCalculatorTest {
    @Test
    void assertTrueTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTrue(appleCalculator.booleanApple("apple"));
        assertTrue(appleCalculator.booleanApple("apple"), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertTrue(appleCalculator.booleanApple("apple"), messageSupplier);
    }
}