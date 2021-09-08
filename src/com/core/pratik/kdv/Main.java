package com.core.pratik.kdv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double price, VAT = 0, included, VATAmount;


        Scanner input = new Scanner(System.in);

        System.out.print("Para miktarını giriniz: ");
        price = input.nextDouble();

        if ((price > 0) && (price <= 1000)) {
            VAT = 0.18;
        } else if (price > 1000) {
            VAT = 0.08;
        }

        VATAmount = price * VAT;
        included = price + VATAmount;

        System.out.println("KDV'siz Fiyat: " + price);
        System.out.println("KDV'li Fiyat: " + included);
        System.out.println("KDV tutarı: " + VATAmount);


    }
}
