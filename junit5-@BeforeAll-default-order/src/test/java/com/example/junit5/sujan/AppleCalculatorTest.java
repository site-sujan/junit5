package com.example.junit5.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AppleCalculatorTest {
    @BeforeAll
    static void beforeAllCase3() {
        System.out.println("AppleCalculatorTest.beforeAllCase3");
    }

    @BeforeAll
    static void beforeAllCase2() {
        System.out.println("AppleCalculatorTest.beforeAllCase2");
    }

    @BeforeAll
    static void beforeAllCase1() {
        System.out.println("AppleCalculatorTest.beforeAllCase1");
    }

    @Test
    void test() {
        System.out.println("AppleCalculatorTest.test");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }
}