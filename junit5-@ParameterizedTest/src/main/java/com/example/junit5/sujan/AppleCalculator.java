package com.example.junit5.sujan;

import java.util.Arrays;
import java.util.List;

public class AppleCalculator {
    List<String> apples = Arrays.asList("McIntosh", "Fuji", "Gala", "Jonagold", "GrannySmith", "PinkLady");

    public boolean isApple(String appleName) {
        return apples.contains(appleName);
    }
}