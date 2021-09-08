package com.core.pratik.not;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mat, fizik, kimya, turkce, tarih, muzik, toplam, ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextDouble();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextDouble();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextDouble();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextDouble();

        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        ortalama = toplam / 6;

        System.out.printf("Not ortalamanız: %f", ortalama);

        if (ortalama > 60) {
            System.out.println("  -> Sınıfı Geçti");
        } else {
            System.out.println("  -> Sınıfta Kaldı");
        }

    }
}
