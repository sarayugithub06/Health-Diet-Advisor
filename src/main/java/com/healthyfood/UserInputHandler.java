package com.healthyfood;

import java.util.*;

public class UserInputHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public static Map<String, String> getUserInfo() {
        Map<String, String> userInfo = new HashMap<>();

        System.out.println("👋 Welcome to your Personalized Diet Planner!");
        System.out.print("🧑 Enter your name: ");
        userInfo.put("name", scanner.nextLine());

        System.out.print("🎂 Enter your age: ");
        userInfo.put("age", scanner.nextLine());

        System.out.print("🚻 Enter your gender (Male/Female/Other): ");
        userInfo.put("gender", scanner.nextLine());

        System.out.print("💬 Enter your health issue (e.g., acidity, diabetes, ulcer): ");
        userInfo.put("issue", scanner.nextLine().toLowerCase());

        return userInfo;
    }
}
