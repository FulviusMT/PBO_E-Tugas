package com.modul3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.addStudent("Noval Kurniawan Kodi", "202310370311213", "Teknik", "Informatika");

        Student student = new Student("Naufal Zainul Zaki", "202310370311219", "Teknik", "Informatika");
        student.displayBooks(new ArrayList<>());
        student.showBorrowedBooks();
        student.returnBooks(new ArrayList<>());

        admin.inputBook();
        admin.displayBooks();
        admin.displayStudents();
    }
}
