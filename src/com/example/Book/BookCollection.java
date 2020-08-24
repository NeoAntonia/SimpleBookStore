package com.example.Book;
import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private List<Book> books;

    public BookCollection(){
        books = new ArrayList<Book>();
        books.add(new Book(1008,"God Of Vengeance", "Jack Collins", 8));
        books.add(new Book(23,"The Perfect plan", "Sydney Sheldon", 12));
        books.add(new Book(4587,"RCHSA practice Exam", "Asghar Gori", 30));
        books.add(new Book(781,"Morning, afternoon and Night", "Sydney Sheldon", 8));
        books.add(new Book(369,"Morning, afternoon and Night", "Sydney Sheldon", 8));
    }

    public Book getBooks(String Bookname) {
        for (Book book : books){
            if (book.getBookName().equals(Bookname)) return book;
        }
        return null;

    }
    public void printAllBooks(){
        for (Book book: books){
            System.out.println(book.getBookName() + ":" + book.getPrice());
        }
    }
}
