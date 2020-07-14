package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AppleCalculatorTest {
    @Test
    void assertArrayEqualsTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertArrayEquals(new int[]{1, 2, 3}, appleCalculator.addAppleArray());
        assertArrayEquals(new int[]{1, 2, 3}, appleCalculator.addAppleArray(), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertArrayEquals(new int[]{1, 2, 3}, appleCalculator.addAppleArray(), messageSupplier);
    }
}