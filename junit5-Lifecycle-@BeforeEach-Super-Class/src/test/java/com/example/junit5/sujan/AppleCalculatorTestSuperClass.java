package com.example.junit5.sujan;

import org.junit.jupiter.api.BeforeAll;

public class AppleCalculatorTestSuperClass {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("AppleCalculatorTest.beforeAll");
    }
}