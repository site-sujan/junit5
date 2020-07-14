package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppleCalculatorTest {
    @AfterAll
    static String afterAllCase1() {
        System.out.println("AppleCalculatorTest.afterAllCase1 has String return type");
        return "apple";
    }

    @AfterAll
    private static void afterAllCase2() {
        System.out.println("AppleCalculatorTest.afterAllCase2 has private access modifier");
    }

    @AfterAll
    private void afterAllCase3() {
        System.out.println("AppleCalculatorTest.afterAllCase3 has not static access modifier");
    }

    @Test
    void test() {
        System.out.println("AppleCalculatorTest.test");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }
}