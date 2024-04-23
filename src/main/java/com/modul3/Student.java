package com.modul3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {
    private String name;
    private String nim;
    private String faculty;
    private String programStudi;
    private ArrayList<Book> borrowedBooks;

    public Student(String name, String nim, String faculty, String programStudi) {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.programStudi = programStudi;
        this.borrowedBooks = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Faculty: " + faculty);
        System.out.println("Program Studi: " + programStudi);
    }

    public void showBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book.getBookId() + " - " + book.getTitle() + " by " + book.getAuthor());
        }
    }

    public void logout() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Logged out.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You have borrowed books. Do you want to return them? (yes/no)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                borrowedBooks.clear();
                System.out.println("Books returned. Logged out.");
            } else {
                System.out.println("Logout cancelled.");
            }
        }
    }

    @Override
    public void displayBooks(ArrayList<Book> books) {
        super.displayBooks(books);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to borrow a book? (yes/no)");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter the ID of the book you want to borrow:");
            String bookId = scanner.nextLine();
            for (Book book : books) {
                if (book.getBookId().equals(bookId)) {
                    if (book.getStock() > 0) {
                        borrowedBooks.add(book);
                        book.setStock(book.getStock() - 1);
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Sorry, the book is out of stock.");
                    }
                    return;
                }
            }
            System.out.println("Invalid book ID.");
        }
    }

    public void returnBooks(ArrayList<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the book you want to return:");
        String bookId = scanner.nextLine();
        for (Book book : borrowedBooks) {
            if (book.getBookId().equals(bookId)) {
                borrowedBooks.remove(book);
                for (Book libraryBook : books) {
                    if (libraryBook.getBookId().equals(bookId)) {
                        libraryBook.setStock(libraryBook.getStock() + 1);
                        break;
                    }
                }
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("You have not borrowed this book.");
    }
}
