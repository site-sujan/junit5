package com.example.junit5.sujan;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class TestExecutionExceptionHandlerImpl implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) {
        System.out.println("TestExecutionExceptionHandlerImpl.handleTestExecutionException");
    }
}
