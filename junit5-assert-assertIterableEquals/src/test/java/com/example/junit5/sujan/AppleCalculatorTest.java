package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class AppleCalculatorTest {
    @Test
    void assertIterableEqualsTest() {
        List<String> appleList = Arrays.asList("Macintosh", "Fuji", "Gala", "Jonagold", "GrannySmith", "PinkLady");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertIterableEquals(appleList, appleCalculator.getApple());
        assertIterableEquals(appleList, appleCalculator.getApple(), "we love apple");
        Supplier<String> messageSupplier = () -> "we love apple";
        assertIterableEquals(appleList, appleCalculator.getApple(), messageSupplier);
    }
}