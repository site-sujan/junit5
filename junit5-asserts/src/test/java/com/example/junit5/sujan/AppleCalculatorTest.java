package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AppleCalculatorTest {
    @Test
    void assertTrueTest() {
        assertTrue(true);
        assertTrue(true, "we love apple");
    }

    @Test
    void assertFalseTest() {
        assertFalse(false);
        assertFalse(false, "we hate apple");
    }

    @Test
    void assertNullTest() {
        assertNull(null);
        assertNull(null, "apple is null");
    }

    @Test
    void assertNotNullTest() {
        assertNotNull("apple");
        assertNotNull("apple", "apple is String Object");
    }

    @Test
    void assertEqualsTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1));
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void assertNotEqualsTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertNotEquals(1, appleCalculator.addApple(1, 1));
        assertNotEquals(1, appleCalculator.addApple(1, 1), "1 apple + 1 apple is not 1 apple");
    }

    @Test
    void assertArrayEqualsTest() {
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{2 / 2, 4 / 2, 6 / 2});
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{2 / 2, 4 / 2, 6 / 2}, "array equal");
    }

    @Test
    void assertSameTest() throws InterruptedException {
        assertSame("apple", "apple");
        assertSame("apple", "apple", "apple object are same");
    }

    @Test
    void assertNotSameTest() {
        assertNotSame("apple", "orange");
        assertNotSame("apple", "orange", "apple and orange are not same");
    }

    @Test
    void assertAllTest() {

        AppleCalculator appleCalculator = new AppleCalculator();
        Apple apple = appleCalculator.getApple();
        assertAll(() -> assertNotNull(apple),
                () -> assertEquals(1, apple.getAppleId()),
                () -> assertEquals("apple", apple.getAppleName())
        );
    }

    @Test
    void addAppleTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertThrows(NullPointerException.class, () -> appleCalculator.getError(null));
    }

    @Test
    void assertDoesNotThrowTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertDoesNotThrow(() -> appleCalculator.getError(new Apple()));
        assertDoesNotThrow(() -> appleCalculator.getError(new Apple()), "it will not throw exception");
    }

    @Test
    void assertTimeoutTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTimeout(Duration.ofSeconds(6), () -> appleCalculator.getTimeout(new Apple()));
    }
}