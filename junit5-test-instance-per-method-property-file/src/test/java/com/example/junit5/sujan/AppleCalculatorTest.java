package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    private int instanceVar = 0;

    @Test
    void addAppleTest1() {
        instanceVar += 1;
        System.out.println("AppleCalculatorTest.addAppleTest1#instanceVar = " + instanceVar);
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void addAppleTest2() {
        instanceVar += 1;
        System.out.println("AppleCalculatorTest.addAppleTest2#instanceVar = " + instanceVar);
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void addAppleTest3() {
        instanceVar += 1;
        System.out.println("AppleCalculatorTest.addAppleTest3#instanceVar = " + instanceVar);
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @BeforeEach
    void setUp() {
        System.out.println("AppleCalculatorTest.setUp");
        instanceVar = 0;
    }

    @AfterEach
    void tearDown() {
        System.out.println("AppleCalculatorTest.tearDown");
        instanceVar = 0;
    }
}