package com.example.junit5.sujan;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(OrderAnnotation.class)
class AppleCalculatorTest {

    @Test
    @Order(5)
    void addAppleTestCase1() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Order(4)
    void addAppleTestCase2() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(4, appleCalculator.addApple(2, 2), "2 apple + 2 apple is 4 apple");
    }

    @Test
    @Order(3)
    void addAppleTestCase3() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(6, appleCalculator.addApple(3, 3), "3 apple + 3 apple is 6 apple");
    }

    @Test
    @Order(2)
    void addAppleTestCase4() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(8, appleCalculator.addApple(4, 4), "4 apple + 4 apple is 8 apple");
    }

    @Test
    @Order(1)
    void addAppleTestCase5() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(10, appleCalculator.addApple(5, 5), "5 apple + 5 apple is 10 apple");
    }
}