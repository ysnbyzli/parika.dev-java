package com.core.odev.kitapSiralayici;


import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> bookList = new HashSet<>();
        bookList.add(new Book("Şeker Portakalı", 182, "Jose Mauro De Vasconcelos", Date.valueOf("2019-06-09")));
        bookList.add(new Book("Güneşi Uyandıralım", 272, "Jose Mauro De Vasconcelos", Date.valueOf("2019-06-08")));
        bookList.add(new Book("Sol Ayağım", 192, "Christy Brown", Date.valueOf("2017-08-25")));
        bookList.add(new Book("İnsan Neyle Yaşar", 56, "Lev N. Tolstoy", Date.valueOf("2020-03-10")));
        bookList.add(new Book("İnci", 102, "John Steinbeck", Date.valueOf("2020-03-25")));

        Set<Book> bookList2 = new TreeSet<>(new Book());
        bookList2.add(new Book("Şeker Portakalı", 182, "Jose Mauro De Vasconcelos", Date.valueOf("2019-06-09")));
        bookList2.add(new Book("Güneşi Uyandıralım", 272, "Jose Mauro De Vasconcelos", Date.valueOf("2019-06-08")));
        bookList2.add(new Book("Sol Ayağım", 192, "Christy Brown", Date.valueOf("2017-08-25")));
        bookList2.add(new Book("İnsan Neyle Yaşar", 56, "Lev N. Tolstoy", Date.valueOf("2020-03-10")));
        bookList2.add(new Book("İnci", 102, "John Steinbeck", Date.valueOf("2020-03-25")));

        System.out.println("###### SIRASIZ ######");
        bookList.forEach(book -> System.out.println(book.getTitle()));

        System.out.println("###### SAYFA SAYISINA GÖRE SIRALI ######");
        bookList2.forEach(book -> System.out.println(book.getTitle()));

    }
}
