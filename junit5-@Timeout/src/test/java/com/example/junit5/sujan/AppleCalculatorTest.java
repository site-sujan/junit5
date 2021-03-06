package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class AppleCalculatorTest {
    @Test
    void assertTimeoutTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTimeout(Duration.ofSeconds(5), () -> appleCalculator.getTimeout());
        assertTimeout(Duration.ofSeconds(5), () -> appleCalculator.getTimeout(), "time out");
        Supplier<String> messageSupplier = () -> "oops time out";
        assertTimeout(Duration.ofSeconds(5), () -> appleCalculator.getTimeout(), messageSupplier);
    }
}