package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterAll;

public class AppleCalculatorTestSuperClass {
    @AfterAll
    public static void afterAll() {
        System.out.println("AppleCalculatorTest.afterAll");
    }
}
