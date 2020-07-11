package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleCalculatorSubTest {
    @Test
    void subAppleTestCase1() throws InterruptedException {
        System.out.println("AppleCalculatorSubTest.subAppleTestCase1");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
    }

    @Test
    void subAppleTestCase2() throws InterruptedException {
        System.out.println("AppleCalculatorSubTest.subAppleTestCase2");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
    }

    @Test
    void subAppleTestCase3() throws InterruptedException {
        System.out.println("AppleCalculatorSubTest.subAppleTestCase3");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
    }

    @Test
    void subAppleTestCase4() throws InterruptedException {
        System.out.println("AppleCalculatorSubTest.subAppleTestCase4");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
    }

    @Test
    void subAppleTestCase5() throws InterruptedException {
        System.out.println("AppleCalculatorSubTest.subAppleTestCase5");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
    }
}