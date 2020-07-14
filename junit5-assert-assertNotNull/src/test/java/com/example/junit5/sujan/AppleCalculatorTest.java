package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppleCalculatorTest {
    @Test
    void assertNotNullTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertNotNull(appleCalculator.booleanApple("orange"));
        assertNotNull(appleCalculator.booleanApple("orange"), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertNotNull(appleCalculator.booleanApple("orange"), messageSupplier);
    }
}