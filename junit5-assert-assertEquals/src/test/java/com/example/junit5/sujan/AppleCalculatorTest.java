package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @Test
    void assertEqualsTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1));
        assertEquals(2, appleCalculator.addApple(1, 1), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertEquals(2, appleCalculator.addApple(1, 1), messageSupplier);
    }
}