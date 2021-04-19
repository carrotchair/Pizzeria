package com.company.pizzeria;

import com.company.Testowa;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    // klasy mają metody i pola
    public boolean czyMaPodwojnySer; // false

    public int wielkoscCm;

    private final String nazwa;

    public boolean czySmakuje = true;

    public List<Ingredient> ingredients;

    //public int ocena;

    //każda klasa ma konstruktor domyślny
//    public Pizza() {
//    }

    //konstruktor - służą do inicjalizacji wartosci/podawania startowych wartosci
    public Pizza(String nazwa, List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        this.nazwa = nazwa;
        wielkoscCm = 20;
    }

    public void zjedz() {
        System.out.println("Właśnie zjadłem/am pizze " + nazwa + " o rozmiarze " + wielkoscCm + "cm");
        czySmakuje();
    }

    public void czySmakuje() {
        if (czySmakuje) {
            System.out.println("Pizza mi smakuje.");
            System.out.println("Daję ocenę 10!");
        } else {
            System.out.println("Pizza mi nie smakuje...");
            System.out.println("Daję ocenę 0...");
        }
    }
}