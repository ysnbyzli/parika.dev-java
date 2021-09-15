package com.core.odev.tekSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        boolean isRight = true;

        Scanner input = new Scanner(System.in);




        while (isRight) {
            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();

            if ((sayi % 2 == 0) && (sayi % 4 == 0)){
                toplam += sayi;
            } else {
                isRight = false;
            }
        }

        System.out.println("Toplam: " + toplam);
    }
}
