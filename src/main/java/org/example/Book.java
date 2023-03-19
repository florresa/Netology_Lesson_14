package org.example;

public class Book extends Product {

    private final String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }
}