package com.example.junit5.sujan;

public class AppleCalculator {
    byte isValidByte(byte digit) {
        Byte aByte = Byte.valueOf(digit);
        return aByte;
    }

    short isValidShort(short digit) {
        Short aShort = Short.valueOf(digit);
        return aShort;
    }

    int isValidInt(int digit) {
        Integer integer = Integer.valueOf(digit);
        return integer;
    }

    long isValidLong(long digit) {
        Long aLong = Long.valueOf(digit);
        return aLong;
    }

    float isValidFlot(float digit) {
        Float aFloat = Float.valueOf(digit);
        return aFloat;
    }

    double isValidDouble(double digit) {
        Double aDouble = Double.valueOf(digit);
        return aDouble;
    }
}