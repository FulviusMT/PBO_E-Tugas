package com.modul1;
import java.util.Scanner;

public class Tugas {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String NIM = "202310370311213", USERNAME = "FulviusMT", PASSWORD = "Mountain Tripotage";

        int pilihan;
        String username, password, nim;

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
                System.out.println("Successful Login as student");
            } else {
                System.out.println("User not found!");
            }
        } else if (pilihan == 2) {
            System.out.print("Enter your username (admin): ");
            username = input.nextLine();
            System.out.print("Enter your password (admin): ");
            password = input.nextLine();
            if (username.equals(USERNAME) && password.equals(PASSWORD)){
                System.out.println("Successful Login as admin");
            } else {
                System.out.println("Admin User not found!");
            }
        } else if (pilihan == 3) {
            System.out.println("Thank you for visiting us :3");
        }
    }
}