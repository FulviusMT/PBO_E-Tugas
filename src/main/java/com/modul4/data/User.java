package com.modul4.data;

import com.modul4.books.Book;

public abstract class User {

    private String nim;

    public User(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void displayBooks(Book[] bookList){

    }
    public void addStudent(){

    }
    public void choiceBook(Book[] bookList){

    }

}
