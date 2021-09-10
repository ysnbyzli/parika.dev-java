package com.core.pratik.login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        username = input.nextLine();

        if(username.equals("yasin")) {

            System.out.print("Şifre giriniz: ");
            password = input.nextLine();

            if (password.equals("123456")) {
                System.out.println("Giriş Başarılı");
            } else {

                System.out.print("Şifre yanlış\nŞifrenizi sıfırlamak ister misiniz ? (e/h) ");
                char doesWant = input.nextLine().charAt(0);

                if (doesWant == 'e') {

                    System.out.print("Yeni şifrenizi giriniz: ");
                    newPassword = input.nextLine();

                    if (password.equals(newPassword) || password.equals("123456")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre başarıyla oluşturuldu!");
                    }

                }

            }

        } else {
            System.out.println("Kullanıcı adınız yanlış!");
        }

    }
}
