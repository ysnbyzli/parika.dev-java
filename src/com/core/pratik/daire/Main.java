package com.core.pratik.daire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14, r, merkezAci, result;


        Scanner input = new Scanner(System.in);

        System.out.print("Yarı çapı giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez açıyı giriniz: ");
        merkezAci = input.nextDouble();

        result = (pi * (r * r) * merkezAci) / 360;

        System.out.println("Dairenin alanı: " + result);

    }
}
