package com.core.odev.kombinasyon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci eleman sayisini giriniz: ");
        n = input.nextInt();

        /* System.out.println("İkinci eleman sayisini giriniz: ");
        r = input.nextInt(); */

        for (int i = 1; i >= n; i++){
            System.out.println(i);
        }

    }
}
