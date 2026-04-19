package com.netflix.demo;

public class App {

    public String getGreeting(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "! Welcome to Netflix.";
    }

    public int getRecommendationCount(String plan) {
        if (plan.equals("premium")) return 20;
        if (plan.equals("standard")) return 10;
        return 5;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting("User"));
        System.out.println("Recommendations: "
            + app.getRecommendationCount("premium"));
    }
}