package com.example.junit5.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddAppleCalculatorTest extends AppleCalculatorTestSuperClass {

    @Test
    void test() {
        System.out.println("AppleCalculatorTest.test");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }
}