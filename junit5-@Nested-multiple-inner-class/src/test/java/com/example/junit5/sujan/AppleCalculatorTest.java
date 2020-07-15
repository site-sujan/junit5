package com.example.junit5.sujan;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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
    class InnerClass1 {
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

    @Nested
    class InnerClass2 {
        @Test
        void addAppleTest() {
            System.out.println("InnerClass2.addAppleTest");
            AppleCalculator appleCalculator = new AppleCalculator();
            assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
        }

        @Test
        void subAppleTest() {
            System.out.println("InnerClass2.subAppleTest");
            AppleCalculator appleCalculator = new AppleCalculator();
            assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
        }

    }
}