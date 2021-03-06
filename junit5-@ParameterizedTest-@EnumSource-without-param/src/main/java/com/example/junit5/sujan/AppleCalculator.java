package com.example.junit5.sujan;

import java.util.Arrays;
import java.util.List;

public class AppleCalculator {
    List<String> apples = Arrays.asList("McIntosh", "Fuji", "Gala", "Jonagold", "GrannySmith", "PinkLady");

    public boolean isApple(AppleEnum appleName) {
        return apples.contains(appleName.name());
    }
}