package com.modul2;
import java.util.Scanner;

public class Tugas2 {
    void displayBooks(){
        String[] idBuku = new String[] { "001", "002", "003" };
        String[] namaBuku = new String[] { "A History of God", "Naruto", "Earth" };
        String[] author = new String[] { "Karen Armstrong   ", "Masashi Kisimoto ", "Tere Liye" };
        String[] category = new String[] { "History", "Comic", "Novel" };
        int[] stock = new int[] { 4, 2, 0 };
        System.out.println("===========================================================================================================================================");
        System.out.println("|| No. || Id Buku || Nama Buku\t\t\t\t\t || Author\t\t\t || Category\t\t || Stock || ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("|| %d   || %s\t || %s\t || %s\t || %s\t || %d\t || \n", i, idBuku[i], namaBuku[i], author[i], category[i], stock[i]);
        }
        System.out.println("===========================================================================================================================================");
    }
}

class Admin{
    String name;
    String nim;
    String faculty;
    String programStudi;
    public void displayStudent(){
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Faculty: " + faculty);
        System.out.println("Program: " + programStudi);
    }
}

class Main{
    public static void main(String[] array){
        String[] userStudent;

        Scanner input = new Scanner(System.in);
        Admin addStudent = new Admin();
        Tugas2 Books = new Tugas2();

        String NIM = "202310370311213", USERNAME = "FulviusMT", PASSWORD = "Mountain Tripotage";

        int pilihan,pilihanAdmin,pilihanBook, idBuku;
        String username, password, nim;
        boolean data = true;

        while (data == true){
            System.out.println("==== Library System ====");
            System.out.println("1. Login as student");
            System.out.println("2. Login as admin");
            System.out.println("3. Exit");

            System.out.print("Choose option (1-3): ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1){
                System.out.print("Enter your student identification number: ");
                nim = input.nextLine();
                if (nim.equals(NIM)){
                    System.out.println("==== Student Menu ====");
                    System.out.println("1. Buku Terpinjam");
                    System.out.println("2. Pinjam Buku");
                    System.out.println("3. Exit");
                    System.out.print("Choose option (1-3): ");
                    pilihanBook = input.nextInt();
                    input.nextLine();
                    if(pilihanBook == 1){
                        System.out.println("Buku yang telah terpinjam: 0");
                    }
                    else if (pilihanBook == 2) {
                        Books.displayBooks();
                        System.out.println();
                        System.out.print("\nPilih buku yang ingin dipinjam: ");
                        idBuku = input.nextInt();
                        input.nextLine();
                    }
                    else if (pilihanBook == 3) {
                        System.out.println("Logging out . . .\n");
                    }
                } else {
                    System.out.println("User not found!");
                }
            } else if (pilihan == 2) {
                System.out.print("Enter your username (admin): ");
                username = input.nextLine();
                System.out.print("Enter your password (admin): ");
                password = input.nextLine();
                if (username.equals(USERNAME) && password.equals(PASSWORD)){
                    System.out.println("==== Admin Menu ====");
                    System.out.println("1. Add Student");
                    System.out.println("2. Display Registered Student");
                    System.out.println("3. Exit");
                    System.out.print("Choose option (1-3): ");
                    pilihanAdmin = input.nextInt();
                    input.nextLine();
                    if(pilihanAdmin == 1){
                        System.out.print("Enter student's name: ");
                        addStudent.name = input.nextLine();
                        System.out.print("Enter student's identification number: ");
                        addStudent.nim = input.nextLine();
                        System.out.print("Enter student's faculty: ");
                        addStudent.faculty = input.nextLine();
                        System.out.print("Enter student's study program: ");
                        addStudent.programStudi = input.nextLine();
                        System.out.println("New student data has been added.\n");
                    }
                    else if (pilihanAdmin == 2) {
                        addStudent.displayStudent();
                        System.out.print("\n");
                    }
                    else if (pilihanAdmin == 3) {
                        System.out.println("Logging out . . .\n");
                    }
                } else {
                    System.out.println("Admin User not found!");
                }
            } else if (pilihan == 3) {
                System.out.println("Thank you for visiting us :3");
                System.exit(0);
            }
        }

    }
}