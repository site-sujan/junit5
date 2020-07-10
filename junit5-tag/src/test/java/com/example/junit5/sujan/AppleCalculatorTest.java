package com.example.junit5.sujan;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {

    @Test
    @Tag("add")
    void addAppleTestCase1() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Tag("add")
    void addAppleTestCase2() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Tag("sub")
    void subAppleTestCase1() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
    }

    @Test
    @Tag("sub")
    void subAppleTestCase2() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(1, appleCalculator.subApple(2, 1), "2 apple - 1 apple is 1 apple");
    }
}