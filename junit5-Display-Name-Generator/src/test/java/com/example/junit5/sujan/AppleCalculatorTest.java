package com.example.junit5.sujan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Apple Calculator Test")
class AppleCalculatorTest {

    @Test
    @DisplayName("Apple Calculator Addition Test")
    void addApple() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @DisplayName("Apple Calculator Addition Test (°□°)")
    void addAppleWithSpecialCharacter() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(4, appleCalculator.addApple(2, 2), "2 apple + 2 apple is 4 apple");
    }

    @Test
    @DisplayName("Apple Calculator Addition Test 😱")
    void addAppleWithEmoji() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(6, appleCalculator.addApple(3, 3), "3 apple + 3 apple is 6 apple");
    }
}