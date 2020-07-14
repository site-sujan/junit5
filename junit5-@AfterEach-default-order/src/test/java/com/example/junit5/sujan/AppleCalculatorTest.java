package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleCalculatorTest {
    @AfterEach
    void setUpCase3() {
        System.out.println("AppleCalculatorTest.setUpCase3");
    }

    @AfterEach
    void setUpCase2() {
        System.out.println("AppleCalculatorTest.setUpCase2");
    }

    @AfterEach
    void setUpCase1() {
        System.out.println("AppleCalculatorTest.setUpCase1");
    }

    @Test
    void addApple() {
        System.out.println("AddAppleCalculatorTest.addApple");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }
}