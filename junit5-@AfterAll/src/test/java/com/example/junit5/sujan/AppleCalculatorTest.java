package com.example.junit5.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AppleCalculatorTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("AppleCalculatorTest.beforeAll");
    }

    @Test
    void test() {
        System.out.println("AppleCalculatorTest.test");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }
}