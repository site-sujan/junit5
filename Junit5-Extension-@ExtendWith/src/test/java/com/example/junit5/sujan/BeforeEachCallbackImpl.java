package com.example.junit5.sujan;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class BeforeEachCallbackImpl implements BeforeEachCallback {
    @Override
    public void beforeEach(ExtensionContext context) {
        System.out.println("BeforeEachCallbackImpl.beforeEach");
    }
}
