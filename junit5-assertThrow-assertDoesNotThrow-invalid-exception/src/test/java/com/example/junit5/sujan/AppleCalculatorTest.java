package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppleCalculatorTest {
    @Test
    void assertThrowTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertThrows(NullPointerException.class, () -> appleCalculator.getError(null));
        assertThrows(NullPointerException.class, () -> appleCalculator.getError(null), "it will throw exception");
        Supplier<String> messageSupplier = () -> "it will throw exception";
        assertThrows(IllegalArgumentException.class, () -> appleCalculator.getError(null), messageSupplier);
    }

    @Test
    void assertDoesNotThrowTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertDoesNotThrow(() -> appleCalculator.getError(new Apple()));
        assertDoesNotThrow(() -> appleCalculator.getError(new Apple()), "it will not throw exception");
        Supplier<String> messageSupplier = () -> "it will not throw exception";
        assertDoesNotThrow(() -> appleCalculator.getError(null), messageSupplier);
    }
}