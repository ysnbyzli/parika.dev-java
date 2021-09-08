package com.core.pratik.alan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int one, two, three, u, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        one = input.nextInt();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        two = input.nextInt();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        three = input.nextInt();

        u = (one + two + three) / 2;

        area = (int) Math.sqrt(u * (u - one) * (u - two) * (u - three));

        System.out.println("Üçgenin Alanı: " + area);
    }
}
