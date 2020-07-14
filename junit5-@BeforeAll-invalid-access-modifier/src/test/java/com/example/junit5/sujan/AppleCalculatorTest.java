package com.example.junit5.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AppleCalculatorTest {
    @BeforeAll
    static String beforeAllCase1() {
        System.out.println("AppleCalculatorTest.beforeAllCase1 has String return type");
        return "apple";
    }

    @BeforeAll
    private static void beforeAllCase2() {
        System.out.println("AppleCalculatorTest.beforeAllCase2 has private access modifier");
    }

    @BeforeAll
    private void beforeAllCase3() {
        System.out.println("AppleCalculatorTest.beforeAllCase3 has not static access modifier");
    }

    @Test
    void test() {
        System.out.println("AppleCalculatorTest.test");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }
}