package com.core.odev.kitapSiralayici;


import java.sql.Date;
import java.util.Comparator;

public class Book implements Comparator<Book> {

    private String title;
    private int numberOfPages;
    private String author;
    private Date realeaseDate;


    public Book() {
    }

    public Book(String title, int numberOfPages, String author, Date realeaseDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.realeaseDate = realeaseDate;
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getNumberOfPages() - o1.getNumberOfPages();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(Date realeaseDate) {
        this.realeaseDate = realeaseDate;
    }
}
