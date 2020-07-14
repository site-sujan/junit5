package com.example.junit5.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubAppleCalculatorTest extends AppleCalculatorTestSuperClass {

    @Test
    void subApple() {
        System.out.println("SubAppleCalculatorTest.subApple");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(1, appleCalculator.subApple(2, 1));
    }
}