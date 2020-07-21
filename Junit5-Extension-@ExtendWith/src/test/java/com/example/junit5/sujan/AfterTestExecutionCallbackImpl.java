package com.example.junit5.sujan;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AfterTestExecutionCallbackImpl implements AfterTestExecutionCallback {
    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("AfterTestExecutionCallbackImpl.afterTestExecution");
    }
}
