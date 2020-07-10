package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

class AppleCalculatorTest {

    @Test
    void assumeTrueTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assumeTrue("apple".equalsIgnoreCase(appleCalculator.getApple()));
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void assumeTrueMessageTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assumeTrue("apple".equalsIgnoreCase(appleCalculator.getApple()), "apple is equal to apple");
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void assumeTrueLambdaTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assumingThat("apple".equalsIgnoreCase(appleCalculator.getApple()), () -> assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple"));
    }

    @Test
    void assumeFalseTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assumeFalse("oranges".equalsIgnoreCase(appleCalculator.getApple()));
        assertEquals(4, appleCalculator.addApple(2, 2), "2 apple + 2 apple is 4 apple");
    }

    @Test
    void assumeFalseMessageTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assumeFalse("oranges".equalsIgnoreCase(appleCalculator.getApple()), "apple is not equal to oranges");
        assertEquals(4, appleCalculator.addApple(2, 2), "2 apple + 2 apple is 4 apple");
    }

    @Test
    void assumeFalseLambdaTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assumingThat("orange".equalsIgnoreCase(appleCalculator.getApple()), () -> assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple"));
    }
}