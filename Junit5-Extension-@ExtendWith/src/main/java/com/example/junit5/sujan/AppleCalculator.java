package com.example.junit5.sujan;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AppleCalculator {
    List<String> apples = Arrays.asList("McIntosh", "Fuji", "Gala", "Jonagold", "GrannySmith", "PinkLady");

    public int addApple(int apple1, int apple2) {
        return apple1 + apple2;
    }

    public String getError(String apple) {
        if (Objects.isNull(apple)) {
            throw new NullPointerException("apple cannot be null");
        }
        return apple;
    }

    public boolean isApple(String appleName) {
        return apples.contains(appleName);
    }
}