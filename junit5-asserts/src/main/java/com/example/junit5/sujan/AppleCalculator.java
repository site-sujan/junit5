package com.example.junit5.sujan;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class AppleCalculator {
    public int addApple(int appleBag1, int appleBag2) {
        return appleBag1 + appleBag2;
    }

    public Apple getApple() {
        Apple apple = new Apple(1, "apple");
        return apple;
    }

    public Apple getError(Apple apple) {
        if (Objects.isNull(apple)) {
            throw new NullPointerException("apple cannot be null");
        }
        return apple;
    }

    public Apple getTimeout(Apple apple) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return apple;
    }
}
