package com.example.junit5.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddAppleCalculatorTest extends AppleCalculatorTestSuperClass {

    @Test
    void addApple() {
        System.out.println("AddAppleCalculatorTest.addApple");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }
}