package com.example.junit5.sujan;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith({TestExecutionExceptionHandlerImpl.class, ParameterResolverImpl.class, BeforeTestExecutionCallbackImpl.class, BeforeEachCallbackImpl.class, AfterEachCallbackImpl.class, AfterTestExecutionCallbackImpl.class, BeforeAllCallbackImpl.class, AfterAllCallbackImpl.class, AfterAllCallbackImpl.class})
class AppleCalculatorTest {
    @AfterAll
    static void afterAll() {
        System.out.println("AppleCalculatorTest.afterAll");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("AppleCalculatorTest.beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("AppleCalculatorTest.beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AppleCalculatorTest.afterEach");
    }

    @Test
    void addAppleTest() {
        System.out.println("AppleCalculatorTest.addAppleTest");
        AppleCalculator appleCalculator = new AppleCalculator();
        assertEquals(2, appleCalculator.addApple(1, 1), "1 apple + 1 apple is 2 apple");
    }

    @Test
    void assertThrowTest() {
        AppleCalculator appleCalculator = new AppleCalculator();
        appleCalculator.getError(null);
    }

    @ParameterizedTest
    @ValueSource(strings = {"McIntosh", "Mango", "Fuji", "Orange", "Gala"})
    void isAppleTest(String appleName) {
        AppleCalculator appleCalculator = new AppleCalculator();
        assertTrue(appleCalculator.isApple(appleName), "yes its an apple");
    }
}