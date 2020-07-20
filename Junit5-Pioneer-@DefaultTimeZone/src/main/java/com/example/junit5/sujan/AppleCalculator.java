package com.example.junit5.sujan;

import java.util.TimeZone;

public class AppleCalculator {
    TimeZone getShortZoneId() {
        TimeZone timeZone = TimeZone.getTimeZone("CET");
        return timeZone;
    }

    TimeZone getLongZoneId() {
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        return timeZone;
    }
}