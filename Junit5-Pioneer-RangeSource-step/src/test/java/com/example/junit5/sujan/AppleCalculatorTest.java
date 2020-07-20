package com.example.junit5.sujan;

import org.junit.jupiter.params.ParameterizedTest;
import org.junitpioneer.jupiter.params.ByteRangeSource;
import org.junitpioneer.jupiter.params.DoubleRangeSource;
import org.junitpioneer.jupiter.params.FloatRangeSource;
import org.junitpioneer.jupiter.params.IntRangeSource;
import org.junitpioneer.jupiter.params.LongRangeSource;
import org.junitpioneer.jupiter.params.ShortRangeSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @ParameterizedTest
    @ByteRangeSource(from = -10, to = 10, step = 1)
    void ByteRangeTest(byte digit) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(digit, appleCalculator.isValidByte(digit));
    }

    @ParameterizedTest
    @ShortRangeSource(from = -10, to = 10, step = 1)
    void shortRangeTest(short digit) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(digit, appleCalculator.isValidShort(digit));
    }

    @ParameterizedTest
    @IntRangeSource(from = -10, to = 10, step = 1)
    void intRangeTest(int digit) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(digit, appleCalculator.isValidInt(digit));
    }

    @ParameterizedTest
    @LongRangeSource(from = -10, to = 10, step = 1)
    void longRangeTest(long digit) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(digit, appleCalculator.isValidLong(digit));
    }

    @ParameterizedTest
    @FloatRangeSource(from = -10, to = 10, step = 1)
    void floatRangeTest(float digit) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(digit, appleCalculator.isValidFlot(digit));
    }

    @ParameterizedTest
    @DoubleRangeSource(from = -10, to = 10, step = 1)
    void doubleRangeTest(double digit) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(digit, appleCalculator.isValidDouble(digit));
    }
}