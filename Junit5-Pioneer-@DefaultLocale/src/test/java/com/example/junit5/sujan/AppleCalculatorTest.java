package com.example.junit5.sujan;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.DefaultLocale;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleCalculatorTest {
    @Test
    @DefaultLocale(language = "en")
    void languageTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(Locale.getDefault(), appleCalculator.getLanguage());
    }

    @Test
    @DefaultLocale(language = "en", country = "EN")
    void languageCountryTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(Locale.getDefault(), appleCalculator.getLanguageCountryTest());
    }

    @Test
    @DefaultLocale(language = "en", country = "EN", variant = "gb")
    void languageCountryVariantTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(Locale.getDefault(), appleCalculator.getLanguageCountryVariant());
    }
}