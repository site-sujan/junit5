package com.example.junit5.sujan;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AfterAllCallbackImpl implements AfterAllCallback {
    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("AfterAllCallbackImpl.afterAll");
    }
}
