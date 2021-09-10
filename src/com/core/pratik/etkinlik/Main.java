package com.core.pratik.etkinlik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık değerini giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
            if (sicaklik >= 5 && sicaklik < 25) {
                if (sicaklik < 15) {
                    System.out.println("Sinemaya gidebilirsiniz.");
                } else {
                    System.out.println("Piknik yapabilirsiniz.");
                }
            } else {
                System.out.println("Yüzmeye gidebilirsiniz.");
            }
        }

    }
}
