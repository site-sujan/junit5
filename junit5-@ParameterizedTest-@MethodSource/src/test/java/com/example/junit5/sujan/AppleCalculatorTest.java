package com.example.junit5.sujan;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppleCalculatorTest {
    static Stream getAppleListFromDb() {
        List appleListFromDb = Arrays.asList("McIntosh", "Mango", "Fuji", "Orange", "Gala");
        return appleListFromDb.stream();
    }

    @ParameterizedTest
    @MethodSource("getAppleListFromDb")
    void isAppleTest(String appleName) {
        System.out.println("appleName = " + appleName);
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTrue(appleCalculator.isApple(appleName), "yes its an apple");
    }
}