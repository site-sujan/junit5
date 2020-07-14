package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertFalse;

class AppleCalculatorTest {
    @Test
    void assertFalseTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertFalse(appleCalculator.booleanApple("apple"));
        assertFalse(appleCalculator.booleanApple("apple"), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertFalse(appleCalculator.booleanApple("apple"), messageSupplier);
    }
}