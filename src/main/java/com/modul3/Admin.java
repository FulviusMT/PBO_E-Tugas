package com.modul3;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User{
    private final ArrayList<Student> studentList;

    public Admin() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(String name, String nim, String faculty, String programStudi) {
        if (nim.length() != 15) {
            System.out.println("Invalid NIM!");
            return;
        }
        Student newStudent = new Student(name, nim, faculty, programStudi);
        studentList.add(newStudent);
        System.out.println("Student added successfully!");
    }

    public void inputBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select book type: (1. Story Book, 2. History Book, 3. Text Book)");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter stock:");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter category:");
        String category = scanner.nextLine();

        String bookId = generateId();
        switch (choice) {
            case 1:
                StoryBook storyBook = new StoryBook(bookId, title, author, category);
                storyBook.setStock(stock);
                break;
            case 2:
                HistoryBook historyBook = new HistoryBook(bookId, title, author, category);
                historyBook.setStock(stock);
                break;
            case 3:
                TextBook textBook = new TextBook(bookId, title, author, category);
                textBook.setStock(stock);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        System.out.println("Book added successfully!");
    }

    @Override
    public void displayBooks() {
        super.displayBooks();
        // Display list of books for admin
    }

    public void displayStudents() {
        System.out.println("List of registered students:");
        for (Student student : studentList) {
            student.displayInfo();
            System.out.println();
        }
    }

    public boolean isAdmin(String username, String password) {
        // Verify credentials
        return true; // Placeholder, actual implementation required
    }

    private String generateId() {
        // Generate unique ID for books
        return "ID123"; // Placeholder, actual implementation required
    }
}
