package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleCalculatorAddTest {
    @Test
    void addAppleTestCase1() throws InterruptedException {
        System.out.println("AppleCalculatorAddTest.addAppleTestCase1");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void addAppleTestCase2() throws InterruptedException {
        System.out.println("AppleCalculatorAddTest.addAppleTestCase2");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void addAppleTestCase3() throws InterruptedException {
        System.out.println("AppleCalculatorAddTest.addAppleTestCase3");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void addAppleTestCase4() throws InterruptedException {
        System.out.println("AppleCalculatorAddTest.addAppleTestCase4");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void addAppleTestCase5() throws InterruptedException {
        System.out.println("AppleCalculatorAddTest.addAppleTestCase5");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }
}