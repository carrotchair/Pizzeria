package com.company;
//jeżeli masz stronę internetową, to piszesz ją tutaj odwrotnie
//każdy napis to nowy folder, czyli
//com - folder, company - folder, Pizzeria - folder

//import com.company.pizzeria.Pizza; //teraz nie musimy pisać importu, ponieważ jesteśmy w tym samym
//pakiecie co klasa, której używamy

import com.company.pizzeria.Cheese;
import com.company.pizzeria.Ingredient;
import com.company.pizzeria.Paprika;
import com.company.pizzeria.Pizza;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int integer = 0; //typy proste, nie mają metod

        String str = "ktos"; //obiekt

        str.charAt(0); //'k'

        //polimorfizm - mogę w main'ie traktować ser jako klasę bazową, czyli składnik
        List<Ingredient> peperoniIngredients = new ArrayList<>();

        Ingredient cheese = new Cheese(300);

        peperoniIngredients.add(cheese);
        peperoniIngredients.add(new Paprika(2));
	    Pizza peperoni = new Pizza("peperoni", peperoniIngredients); //Pizza - klasa, peperoni - obiekt
        peperoni.czyMaPodwojnySer = true;
        peperoni.czySmakuje = false;
        peperoni.zjedz();

        Pizza hawajska = new Pizza("hawajska", new ArrayList<>()); //obiekty
        //hawajska.nazwa = "peperoni";
        //teraz ta nazwa jest prywatna, więc tutaj nie mogę jej zmienić
        hawajska.czyMaPodwojnySer = false;
        hawajska.wielkoscCm = 15;
        hawajska.czySmakuje = true;
        hawajska.zjedz();

        Testowa test = new Testowa();
        test.zmiennaPublic = 8;
        test.zmiennaPackage = 7;
        //test.zmiennaPrivate = 6;
    }
}
