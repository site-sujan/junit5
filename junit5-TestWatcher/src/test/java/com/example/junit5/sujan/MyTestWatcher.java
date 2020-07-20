package com.example.junit5.sujan;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class MyTestWatcher implements TestWatcher {
    @Override
    public void testAborted(ExtensionContext extensionContext, Throwable throwable) {
        System.out.println("MyTestWatcher.testAborted");
        System.out.println("extensionContext = " + extensionContext);
        System.out.println("throwable = " + throwable);
    }

    @Override
    public void testDisabled(ExtensionContext extensionContext, Optional<String> optional) {
        System.out.println("MyTestWatcher.testDisabled");
        System.out.println("extensionContext = " + extensionContext);
        System.out.println("optional = " + optional);
    }

    @Override
    public void testFailed(ExtensionContext extensionContext, Throwable throwable) {
        System.out.println("MyTestWatcher.testFailed");
        System.out.println("extensionContext = " + extensionContext);
        System.out.println("throwable = " + throwable);
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
        System.out.println("MyTestWatcher.testSuccessful");
        System.out.println("extensionContext = " + extensionContext);
    }
}