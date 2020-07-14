package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNull;

class AppleCalculatorTest {
    @Test
    void assertFalseTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertNull(appleCalculator.booleanApple("apple"));
        assertNull(appleCalculator.booleanApple("apple"), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertNull(appleCalculator.booleanApple("apple"), messageSupplier);
    }
}