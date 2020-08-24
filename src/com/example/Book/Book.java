package com.example.Book;

public class Book {
    private  double ISBN;
    private  String BookName;
    private  String Author;
    private BookPrices price;

    public Book(double isbn,String bookName, String author, double price) {
        this.ISBN = isbn;
        this.BookName = bookName;
        this.Author = author;
        this.price = new BookPrices(price);
    }

    public String getBookName() { return BookName;}

    public double getISBN() { return ISBN;}

    public String getAuthor() { return Author; }

    public void setPrice(Double price){ this.price = new BookPrices(price); }

    public BookPrices getPrice(){return this.price;}

}
