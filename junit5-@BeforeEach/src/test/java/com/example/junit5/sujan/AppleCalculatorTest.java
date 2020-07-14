package com.example.junit5.sujan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppleCalculatorTest {
    @BeforeEach
    void setUp() {
        System.out.println("AppleCalculatorTest.setUp");
    }

    @Test
    void addApple() {
        System.out.println("AppleCalculatorTest.addApple");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(2, appleCalculator.addApple(1, 1));
    }

    @Test
    void subApple() {
        System.out.println("AppleCalculatorTest.subApple");
        AppleCalculator appleCalculator = new AppleCalculator();
        Assertions.assertEquals(1, appleCalculator.subApple(2, 1));
    }
}