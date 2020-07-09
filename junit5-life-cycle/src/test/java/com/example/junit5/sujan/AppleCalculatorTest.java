package com.example.junit5.sujan;

import org.junit.jupiter.api.*;

class AppleCalculatorTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("AppleCalculatorTest.beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AppleCalculatorTest.afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("AppleCalculatorTest.beforeEach");
    }

    @Test
    void test() {
        System.out.println("AppleCalculatorTest.test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AppleCalculatorTest.afterEach");
    }
}