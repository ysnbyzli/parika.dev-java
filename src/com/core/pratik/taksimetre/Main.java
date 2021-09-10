package com.core.pratik.taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double birim = 2.20, ucret = 10;
        int mesafe;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        mesafe = input.nextInt();

        ucret += mesafe * birim;

        if (ucret < 20) ucret = 20;

        System.out.println("Ödenecek tutar: " + ucret);


    }
}
