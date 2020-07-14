package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AppleCalculatorTest {
    @Test
    void assertNotEqualsTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertNotEquals(1, appleCalculator.addApple(1, 1));
        assertNotEquals(1, appleCalculator.addApple(1, 1), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertNotEquals(1, appleCalculator.addApple(1, 1), messageSupplier);
    }
}