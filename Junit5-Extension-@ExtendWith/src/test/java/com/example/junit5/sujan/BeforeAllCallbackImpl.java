package com.example.junit5.sujan;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class BeforeAllCallbackImpl implements BeforeAllCallback {
    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("BeforeAllCallbackImpl.beforeAll");
    }
}
