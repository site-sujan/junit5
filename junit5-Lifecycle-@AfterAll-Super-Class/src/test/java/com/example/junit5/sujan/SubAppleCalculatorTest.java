package com.example.junit5.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubAppleCalculatorTest extends AppleCalculatorTestSuperClass {

    @Test
    void test() {
        System.out.println("AppleCalculatorTest.test");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(1, appleCalculator.subApple(2, 1));
    }
}