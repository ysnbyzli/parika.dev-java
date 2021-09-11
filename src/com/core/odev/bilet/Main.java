package com.core.odev.bilet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, yas, tip;

        double mUcret = 0.1, indirim = 0, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (Tek Yön -> 1 | Gidiş-Dönüş -> 2): ");
        tip = input.nextInt();


        if ((yas > 0 && km > 0) && (tip == 1 || tip == 2)) {
            if (yas <= 12) {
                indirim = 0.5;
            } else if (yas > 12 && yas <= 24){
                indirim = 0.1;
            } else if(yas >= 65) {
                indirim = 0.3;
            }

            if (tip == 2) {
                indirim += 0.2;
            }
        } else {
            System.out.println("Hatalı değer girdiniz!");
        }


        toplam = (km * mUcret) * (indirim > 0 ? indirim : 1);

        System.out.println("Toplam tutar: " + toplam);

    }
}
