package com.healthyfood;

import java.util.*;

public class HealthDietAdvisor {

    // 🌞 Morning Meals
    public static Map<String, List<String>> getMorningMeals() {
        Map<String, List<String>> morningMeals = new HashMap<>();

        morningMeals.put("acidity", Arrays.asList("Banana 🍌", "Coconut Water 🥥", "Idli with Chutney 🌿"));
        morningMeals.put("ulcer", Arrays.asList("Papaya", "Boiled Potato", "Oats Porridge"));
        morningMeals.put("pcod", Arrays.asList("Methi Paratha", "Apple Cider Water", "Boiled Egg"));
        morningMeals.put("diabetes", Arrays.asList("Oats", "Moong Dal Chilla", "Sprouts Salad"));
        morningMeals.put("gastritis", Arrays.asList("Coconut Water", "Rice Kanji", "Boiled Banana"));

        morningMeals.put("anemia", Arrays.asList("Beetroot juice", "Dates", "Spinach paratha"));


        morningMeals.put("thyroid", Arrays.asList("Boiled eggs", "Whole grain toast", "Coconut chutney with idli"));


        morningMeals.put("constipation", Arrays.asList("Papaya", "Warm lemon water", "Oats porridge"));

        morningMeals.put("eye problems", Arrays.asList("Carrot juice", "Boiled eggs", "Spinach dosa"));

        morningMeals.put("kidney stones", Arrays.asList("Barley water", "Low-oxalate fruit bowl", "Upma with veggies"));

        morningMeals.put("migraine", Arrays.asList("Ginger tea", "Banana", "Poha with peanuts"));

        morningMeals.put("obesity", Arrays.asList("Green tea", "Boiled moong salad", "Multigrain toast with avocado"));

        morningMeals.put("liver problems", Arrays.asList("Coconut water", "Steamed rice flakes (poha)", "Herbal tea"));

        morningMeals.put("skin allergy", Arrays.asList("Amla juice", "Pumpkin dosa", "Steamed veggies"));


        morningMeals.put("low bp", Arrays.asList("Salted lemon water", "Dry fruits", "Ragi malt"));


        return morningMeals;
    }

    // 🍽️ Afternoon Meals
    public static Map<String, List<String>> getAfternoonMeals() {
        Map<String, List<String>> afternoonMeals = new HashMap<>();

        afternoonMeals.put("acidity", Arrays.asList("Plain Dal Rice 🍛", "Boiled Veggies 🥦", "Cucumber 🥒"));
        afternoonMeals.put("ulcer", Arrays.asList("Khichdi", "Pumpkin Curry", "Boiled Rice"));
        afternoonMeals.put("pcod", Arrays.asList("Brown Rice", "Tofu Curry", "Salad"));
        afternoonMeals.put("diabetes", Arrays.asList("Chapati", "Bitter Gourd Curry", "Cabbage Stir Fry"));
        afternoonMeals.put("gastritis", Arrays.asList("Steamed Rice", "Bottle Gourd Curry", "Mint Chutney"));
        // ✅ ANEMIA
        afternoonMeals.put("anemia", Arrays.asList("Palak dal", "Beetroot salad", "Brown rice", "Mint chutney"));

// ✅ THYROID
        afternoonMeals.put("thyroid", Arrays.asList("Chapati with soya curry", "Cabbage sabzi", "Lassi"));

// ✅ CONSTIPATION
        afternoonMeals.put("constipation", Arrays.asList("Brown rice", "Mixed vegetable curry", "Curd", "Guava"));

// ✅ EYE PROBLEMS
        afternoonMeals.put("eye problems", Arrays.asList("Carrot-beans poriyal", "Jeera rice", "Green moong dal"));

// ✅ KIDNEY STONES
        afternoonMeals.put("kidney stones", Arrays.asList("Lauki curry", "Plain rice", "Low-salt dal", "Cucumber slices"));

// ✅ MIGRAINE
        afternoonMeals.put("migraine", Arrays.asList("Veg khichdi", "Mint raita", "Steamed bottle gourd curry"));

// ✅ OBESITY
        afternoonMeals.put("obesity", Arrays.asList("Millet roti", "Palak sabzi", "Cabbage stir-fry", "Lemon juice"));

// ✅ LIVER DISEASE
        afternoonMeals.put("liver problems", Arrays.asList("Soft plain rice", "Moong dal", "Beetroot curry", "Buttermilk"));

// ✅ SKIN ALLERGY
        afternoonMeals.put("skin allergy", Arrays.asList("Roti with lauki curry", "Turmeric dal", "Carrot-cucumber salad"));

// ✅ LOW BP
        afternoonMeals.put("low bp", Arrays.asList("Aloo-methi sabzi", "Jeera rice", "Salted buttermilk", "Dates"));


        return afternoonMeals;
    }

    // 🍎 Evening Snacks
    public static Map<String, List<String>> getEveningSnacks() {
        Map<String, List<String>> snacks = new HashMap<>();

        snacks.put("acidity", Arrays.asList("Apple 🍎", "Herbal Tea 🍵", "Roasted Makhana 🌰"));
        snacks.put("ulcer", Arrays.asList("Boiled Sweet Potato", "Chamomile Tea", "Banana"));
        snacks.put("pcod", Arrays.asList("Green Tea", "Nuts", "Cucumber Slices"));
        snacks.put("diabetes", Arrays.asList("Roasted Chana", "Green Tea", "Boiled Egg"));
        snacks.put("gastritis", Arrays.asList("Amla Juice", "Puffed Rice", "Boiled Carrot"));
        // ✅ ANEMIA
        snacks.put("anemia", Arrays.asList("Pomegranate juice 🍷", "Roasted chickpeas 🌰", "Dry dates 🍬"));

// ✅ THYROID
        snacks.put("thyroid", Arrays.asList("Makhana roasted in ghee 🍘", "Boiled sweet potato 🍠", "Herbal tea ☕"));

// ✅ CONSTIPATION
        snacks.put("constipation", Arrays.asList("Papaya cubes 🧡", "Prune juice 🥤", "Roasted flaxseeds 🌾"));

// ✅ EYE PROBLEMS
        snacks.put("eye problems", Arrays.asList("Carrot sticks 🥕", "Dry fruits trail mix 🥜", "Spinach juice 🧃"));

// ✅ KIDNEY STONES
        snacks.put("kidney stones", Arrays.asList("Coconut water 🥥", "Watermelon 🍉", "Steamed corn 🌽"));

// ✅ MIGRAINE
        snacks.put("migraine", Arrays.asList("Chamomile tea 🍵", "Fox nuts (makhana) 🍘", "Oats cookies 🍪"));

// ✅ OBESITY
        snacks.put("obesity", Arrays.asList("Sprouts chaat 🫘", "Cucumber sticks 🥒", "Green tea ☕"));

// ✅ LIVER DISEASE
        snacks.put("liver problems", Arrays.asList("Apple slices 🍎", "Boiled moong 🟢", "Mint tea 🌿"));

// ✅ SKIN ALLERGY
        snacks.put("skin allergy", Arrays.asList("Coconut slices 🥥", "Turmeric milk 🥛", "Rice flakes with jaggery 🍚"));

// ✅ LOW BP
        snacks.put("low bp", Arrays.asList("Banana milkshake 🍌🥛", "Salted lemon water 🍋", "Boiled potatoes 🥔"));


        return snacks;
    }


    // 🌙 Night Meals
    public static Map<String, List<String>> getNightMeals() {
        Map<String, List<String>> nightMeals = new HashMap<>();

        nightMeals.put("acidity", Arrays.asList("Khichdi", "Carrot Soup 🥕", "Steamed Rice with Ghee"));
        nightMeals.put("ulcer", Arrays.asList("Oats Khichdi", "Carrot Rice", "Moong Dal Soup"));
        nightMeals.put("pcod", Arrays.asList("Vegetable Soup", "Quinoa Khichdi", "Curd Rice"));
        nightMeals.put("diabetes", Arrays.asList("Vegetable Upma", "Wheat Dosa", "Lauki Soup"));
        nightMeals.put("gastritis", Arrays.asList("Curd Rice", "Boiled Pumpkin", "Jeera Water"));
        // ✅ ANEMIA
        nightMeals.put("anemia", Arrays.asList("Spinach dal with rice 🍲", "Beetroot curry 🥬", "Ragi roti with ghee 🫓"));

// ✅ THYROID
        nightMeals.put("thyroid", Arrays.asList("Vegetable upma 🥘", "Moong dal dosa 🌮", "Boiled broccoli + chapati 🥦"));

// ✅ CONSTIPATION
        nightMeals.put("constipation", Arrays.asList("Vegetable khichdi 🍚", "Steamed pumpkin curry 🎃", "Chapati + Palak dal 🫓"));

// ✅ EYE PROBLEMS
        nightMeals.put("eye problems", Arrays.asList("Carrot soup 🥕", "Tomato rice 🍅", "Methi chapati + lauki sabzi 🌿"));

// ✅ KIDNEY STONES
        nightMeals.put("kidney stones", Arrays.asList("Bottle gourd curry 🍲", "Boiled rice + dal 🍛", "Cucumber raita 🥒"));

// ✅ MIGRAINE
        nightMeals.put("migraine", Arrays.asList("Oats khichdi 🌾", "Turmeric milk 🥛", "Steamed rice + palak gravy 🍃"));

// ✅ OBESITY
        nightMeals.put("obesity", Arrays.asList("Lauki soup 🥣", "Steamed sprouts salad 🥗", "1 phulka + boiled veggies 🥬"));

// ✅ LIVER PROBLEMS
        nightMeals.put("liver problems", Arrays.asList("Soft khichdi 🥣", "Boiled lauki curry 🍛", "Mint rice + curd 🍃"));

// ✅ SKIN ALLERGY
        nightMeals.put("skin allergy", Arrays.asList("Moong dal soup 🍲", "Bottle gourd paratha 🎃", "Curd rice 🍚"));

// ✅ LOW BP
        nightMeals.put("low bp", Arrays.asList("Ajwain paratha 🫓", "Salted dal + rice 🍛", "Banana + warm milk 🍌🥛"));


        return nightMeals;
    }
}
