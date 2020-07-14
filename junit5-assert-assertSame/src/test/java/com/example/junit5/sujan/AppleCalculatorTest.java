package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertSame;

class AppleCalculatorTest {
    @Test
    void assertSameTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertSame("apple", appleCalculator.getApple());
        assertSame("apple", appleCalculator.getApple(), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertSame("apple", appleCalculator.getApple(), messageSupplier);
    }
}