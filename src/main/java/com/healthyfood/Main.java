

package com.healthyfood;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Example: Show diet plan for "diabetes"
        String issue = "diabetes";

        System.out.println("🍽️ Diet Plan for: " + issue.toUpperCase());
        System.out.println("\n🌞 Morning: " + HealthDietAdvisor.getMorningMeals().get(issue));
        System.out.println("🍛 Afternoon: " + HealthDietAdvisor.getAfternoonMeals().get(issue));
        System.out.println("🍎 Evening Snacks: " + HealthDietAdvisor.getEveningSnacks().get(issue));
        System.out.println("🌙 Night: " + HealthDietAdvisor.getNightMeals().get(issue));
    }
}
