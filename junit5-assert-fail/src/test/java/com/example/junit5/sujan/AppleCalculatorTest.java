package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.fail;

class AppleCalculatorTest {
    @Test
    void failTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        fail();
        fail(appleCalculator.getApple());
        fail("we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        fail(messageSupplier);
    }
}