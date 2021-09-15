package com.core.odev.kuvvet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        System.out.println("4'ün Katları");
        for(int i = 1; i <= sayi; i*=4){
            System.out.println(i);
        }

        System.out.println("5'in Katları");
        for(int i = 1; i <= sayi; i*=5){
            System.out.println(i);
        }
    }
}
