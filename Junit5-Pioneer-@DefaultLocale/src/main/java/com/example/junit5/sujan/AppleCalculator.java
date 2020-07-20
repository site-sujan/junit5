package com.example.junit5.sujan;

import java.util.Locale;

public class AppleCalculator {
    Locale getLanguage() {
        Locale locale = new Locale("en");
        return locale;
    }

    Locale getLanguageCountryTest() {
        Locale locale = new Locale("en", "EN");
        return locale;
    }

    Locale getLanguageCountryVariant() {
        Locale locale = new Locale("en", "EN", "gb");
        return locale;
    }
}