package com.core.odev.manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14, aKilo;
        double elma = 3.67, eKilo;
        double domates = 1.11, dKilo;
        double muz = 0.95, mKilo;
        double patlican = 5.00, pKilo;

        Scanner input = new Scanner(System.in);


        System.out.print("Armut kaç kilo: ");
        aKilo = input.nextInt();

        System.out.print("Elma kaç kilo: ");
        eKilo = input.nextInt();

        System.out.print("Domates kaç kilo: ");
        dKilo = input.nextInt();

        System.out.print("Muz kaç kilo: ");
        mKilo = input.nextInt();

        System.out.print("Patlıcan kaç kilo: ");
        pKilo = input.nextInt();

        double result = (armut * aKilo) + (elma * eKilo) + (domates * dKilo) + (muz * mKilo) + (patlican * pKilo);
        System.out.println("Toplam tutar: " + result);


    }
}
