package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
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

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class InnerClass {
        @BeforeAll
        void beforeAll() {
            System.out.println("InnerClass.beforeAll");
        }

        @AfterAll
        void afterAll() {
            System.out.println("InnerClass.afterAll");
        }

        @BeforeEach
        void setUp() {
            System.out.println("InnerClass.setUp");
        }

        @AfterEach
        void tearDown() {
            System.out.println("InnerClass.tearDown");
        }

        @Test
        void addAppleTest() {
            System.out.println("InnerClass1.addAppleTest");
            AppleCalculator appleCalculator = new AppleCalculator();
            assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
        }

        @Test
        void subAppleTest() {
            System.out.println("InnerClass1.subAppleTest");
            AppleCalculator appleCalculator = new AppleCalculator();
            assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
        }
    }
}