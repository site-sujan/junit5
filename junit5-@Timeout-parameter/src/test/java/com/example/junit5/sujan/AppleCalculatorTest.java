package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @Test
    @Timeout(value = 6, unit = TimeUnit.DAYS)
    void addAppleTestCase1() throws InterruptedException {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Timeout(value = 6, unit = TimeUnit.HOURS)
    void addAppleTestCase2() throws InterruptedException {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Timeout(value = 6, unit = TimeUnit.MICROSECONDS)
    void addAppleTestCase3() throws InterruptedException {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Timeout(value = 6, unit = TimeUnit.MILLISECONDS)
    void addAppleTestCase4() throws InterruptedException {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Timeout(value = 6, unit = TimeUnit.MINUTES)
    void addAppleTestCase5() throws InterruptedException {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Timeout(value = 6, unit = TimeUnit.NANOSECONDS)
    void addAppleTestCase6() throws InterruptedException {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    @Timeout(value = 6, unit = TimeUnit.SECONDS)
    void addAppleTestCase7() throws InterruptedException {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }
}