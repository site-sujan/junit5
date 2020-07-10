package com.example.junit5.sujan;

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

}