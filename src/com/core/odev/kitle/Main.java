package com.core.odev.kitle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        System.out.println("Vücut kitle endeksiniz: " + (kilo / (boy * boy)));
    }
}
