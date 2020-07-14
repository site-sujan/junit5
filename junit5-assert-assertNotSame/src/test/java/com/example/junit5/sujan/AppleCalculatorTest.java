package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotSame;

class AppleCalculatorTest {
    @Test
    void assertNotSameTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertNotSame("orange", appleCalculator.getApple());
        assertNotSame("orange", appleCalculator.getApple(), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertNotSame("orange", appleCalculator.getApple(), messageSupplier);
    }
}