package com.example.Book;

public class Main {

    public static void main(String[] args) {

        BookCollection libro = new BookCollection();

        System.out.println(libro.getBooks("The Perfect plan").getISBN());

    }
}
