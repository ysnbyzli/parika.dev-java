package com.core.odev.listeSinifi;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(80);
        liste.add(110);

        System.out.println("80 değerinin listedeki ilk değeri: " + liste.indexOf(80));
        System.out.println("80 değerinin listedeki son index'i: " + liste.lastIndexOf(80));
        System.out.println("Liste boş mu* " + liste.isEmpty());

        MyList<Integer> liste2 = liste.sublist(2, 5);
        System.out.println("Yeni listenin ilk elamanı: " + liste2.get(0));

        System.out.println("2 değeri listede var mı? " + liste.contains(2));
        System.out.println("####### Elemanların Listesi ########");
        System.out.println(liste.toString());

    }
}
