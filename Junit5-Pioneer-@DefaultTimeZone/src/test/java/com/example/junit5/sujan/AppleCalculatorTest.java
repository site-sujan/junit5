package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.DefaultTimeZone;

import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @Test
    @DefaultTimeZone("CET")
    void shortZoneIdTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(TimeZone.getDefault(), appleCalculator.getShortZoneId());
    }

    @Test
    @DefaultTimeZone("America/Los_Angeles")
    void longZoneIdTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(TimeZone.getDefault(), appleCalculator.getLongZoneId());
    }
}