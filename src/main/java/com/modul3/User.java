package com.modul3;

import java.util.ArrayList;

abstract class User {
    public void displayBooks(ArrayList<Book> books) {
        System.out.println("List of Books:");
        for (Book book : books) {
            System.out.println(book.getBookId() + " - " + book.getTitle() + " by " + book.getAuthor() + " [" + book.getCategory() + "] Stock: " + book.getStock());
        }
    }
    public void addBook(ArrayList<Book> books, Book newBook) {
        books.add(newBook);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
    }
}
