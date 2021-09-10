package com.core.pratik.hesap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                result = n1 + n2;
                System.out.println("Toplam: " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println("Çıkarma: " + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println("Çarpma: " + result);
                break;
            case 4:
                result = n1 / n2;
                System.out.println("Bölme: " + result);
                break;
        }


    }
}
