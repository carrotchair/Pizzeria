package com.company;

public class Testowa {

    //folded
    public int pole; // 0 (wszystkie numerki to zero)

    public char aChar;

    public String string; //typy klasowe (nie proste) mają domyślną wartość null

    public int zmienna;

    public int zmiennaPublic; // dostepne wszedzie

    private int zmiennaPrivate; // dostepna w danym zakresie (tej klasy)

    private final int stała = 1;

    int zmiennaPackage;

    public Testowa() {
    }

    public void testowa() {

        zmiennaPrivate = 9;

        int zmienna = 1; // to jest zmienna lokalna, nie ma jeszcze wartosci , a nie zero

        System.out.println(zmienna); // 1

        System.out.println(this.zmienna); // 0

        System.out.println(string);

        System.out.println(aChar);

        if(string != null) {
            System.out.println(string.charAt(0)); // NullPointerException / NullReferenceException bez ifa
        }
        //System.out.println(zmienna);
    }
}
