package com.example.junit5.sujan;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AfterEachCallbackImpl implements AfterEachCallback {
    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("AfterEachCallbackImpl.afterEach");
    }
}
