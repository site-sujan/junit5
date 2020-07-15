package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @AfterAll
    static void afterAll() {
        System.out.println("AppleCalculatorTest.afterAll");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("AppleCalculatorTest.beforeAll");
    }

    @Test
    void addAppleTest() {
        System.out.println("AppleCalculatorTest.addAppleTest");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void subAppleTest() {
        System.out.println("AppleCalculatorTest.subAppleTest");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
    }

    @BeforeEach
    void setUp() {
        System.out.println("AppleCalculatorTest.setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AppleCalculatorTest.tearDown");
    }

    @Nested
    class InnerClass {

        @Test
        void addAppleTest() {
            System.out.println("InnerClass.addAppleTest");
            AppleCalculator appleCalculator = new AppleCalculator();
            assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
        }

        @Test
        void subAppleTest() {
            System.out.println("InnerClass.subAppleTest");
            AppleCalculator appleCalculator = new AppleCalculator();
            assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
        }
    }
}