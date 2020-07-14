package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppleCalculatorTest {
    @AfterAll
    static void AfterAllCase3() {
        System.out.println("AppleCalculatorTest.AfterAllCase3");
    }

    @AfterAll
    static void AfterAllCase2() {
        System.out.println("AppleCalculatorTest.AfterAllCase2");
    }

    @AfterAll
    static void AfterAllCase1() {
        System.out.println("AppleCalculatorTest.AfterAllCase1");
    }

    @Test
    void test() {
        System.out.println("AppleCalculatorTest.test");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }
}