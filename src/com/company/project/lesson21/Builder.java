package com.company.project.lesson21;

public class NutritionFacts {
    private int calories;
    private int servings;
    private int fat;

    private NutritionFacts(Builder builder){
        calories = builder.calories;
        fat = builder.fat;
        servings = builder.servings;
    }
    public static class Builder {
        private int calories;
        private int servings;
        private int fat;
        public Builder(int calories) {this.calories = calories; }
        public Builder servings(int servings){ //30
            this.servings = servings;
            return this;

        }
    } 
}
