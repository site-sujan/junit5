package com.example.junit5.sujan;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE;
import static org.junit.jupiter.params.provider.EnumSource.Mode.INCLUDE;

class AppleCalculatorTest {
    @ParameterizedTest
    @EnumSource(value = AppleEnum.class, names = {"McIntoshApple", "FujiApple", "GalaApple"}, mode = INCLUDE)
    void isAppleIncludeTest(AppleEnum appleName) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTrue(appleCalculator.isApple(appleName), "yes its an apple");
    }

    @ParameterizedTest
    @EnumSource(value = AppleEnum.class, names = {"Mango", "Orange"}, mode = EXCLUDE)
    void isAppleExcludeTest(AppleEnum appleName) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTrue(appleCalculator.isApple(appleName), "yes its an apple");
    }
}