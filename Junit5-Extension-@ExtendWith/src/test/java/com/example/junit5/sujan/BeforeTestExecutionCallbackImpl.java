package com.example.junit5.sujan;

import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class BeforeTestExecutionCallbackImpl implements BeforeTestExecutionCallback {
    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("BeforeTestExecutionCallbackImpl.beforeTestExecution");
    }
}
