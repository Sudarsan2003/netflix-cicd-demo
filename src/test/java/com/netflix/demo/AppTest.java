package com.netflix.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App app = new App();

    @Test
    void testGreetingWithName() {
        assertEquals(
            "Hello, Alice! Welcome to Netflix.",
            app.getGreeting("Alice")
        );
    }

    @Test
    void testGreetingNoName() {
        assertEquals("Hello, Guest!", app.getGreeting(""));
    }

    @Test
    void testPremiumPlan() {
        assertEquals(20, app.getRecommendationCount("premium"));
    }

    @Test
    void testBasicPlan() {
        assertEquals(5, app.getRecommendationCount("basic"));
    }
}