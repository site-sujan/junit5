package com.example.junit5.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppleCalculatorTest {
    @BeforeEach
    static void setUpCase3() {
        System.out.println("AppleCalculatorTest.setUpCase3");
    }

    @BeforeEach
    String setUpCase1() {
        System.out.println("AppleCalculatorTest.setUpCase1");
        return "apple";
    }

    @BeforeEach
    private void setUpCase2() {
        System.out.println("AppleCalculatorTest.setUpCase2");
    }

    @Test
    void addApple() {
        System.out.println("AppleCalculatorTest.addApple");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }
}