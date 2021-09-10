package com.core.pratik.sinif;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, toplam, adet;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        toplam = (mat >= 0 && mat <= 100 ? mat : 0) +
                 (fizik >= 0 && fizik <= 100 ? fizik : 0) +
                 (turkce >= 0 && turkce <= 100 ? turkce : 0) +
                 (kimya >= 0 && kimya <= 100 ? kimya : 0) +
                 (muzik >= 0 && muzik <= 100 ? muzik : 0);

        adet =  (mat >= 0 && mat <= 100 ? 1 : 0) +
                (fizik >= 0 && fizik <= 100 ? 1 : 0) +
                (turkce >= 0 && turkce <= 100 ? 1 : 0) +
                (kimya >= 0 && kimya <= 100 ? 1 : 0) +
                (muzik >= 0 && muzik <= 100 ? 1 : 0);

        int ortalama = toplam / adet;

        if (ortalama > 55){
            System.out.println("Sınıfı geçtiniz!");
        } else {
            System.out.println("Sınıfta kaldınız :(");
        }

        System.out.println("Ortalamanız: " + ortalama);



    }
}
