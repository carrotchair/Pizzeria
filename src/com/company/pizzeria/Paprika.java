package com.company.pizzeria;

public class Paprika extends Ingredient {
    int count;

    public Paprika(int count) {
        this.count = count;
        this.weightGram = count * 100; // zakładamy ze papryki 100g
    }
}
