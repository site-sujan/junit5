package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class AppleCalculatorTest {
    @Test
    void assertTimeoutPreemptivelyTest() {
        System.out.println("AppleCalculatorTest.assertTimeoutPreemptivelyTest ThreadId:- " + Thread.currentThread().getId() + " ThreadName:- " + Thread.currentThread().getName());
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> appleCalculator.getTimeout());
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> appleCalculator.getTimeout(), "oops time out");
        Supplier<String> messageSupplier = () -> "oops time out";
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> appleCalculator.getTimeout(), messageSupplier);
    }
}