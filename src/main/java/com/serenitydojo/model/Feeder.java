package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            if (isPremium) {
                return "Salmon";
            } else {
                return "Tuna";
            }

        } else if (animal.equals("Dog")) {
            if (isPremium) {
                return "Wet Food";
            } else {
                return "Dog Food";
            }
        } else if (animal.equals("Hamster")) {
            return (isPremium) ? "Nuts" : "Cabbage";
        }

        return "Food";
    }
}
