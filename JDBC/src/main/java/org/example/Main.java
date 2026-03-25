package org.example;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        StudentDTO sd = new StudentDTO();

        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Find by Register");
        System.out.println("4. Find All");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter Name:");
            String name = sc.next();
            System.out.println("Enter Gender (1-Male, 2-Female):");
            int gender = sc.nextInt();
            System.out.println("Enter Register No:");
            int register = sc.nextInt();
            System.out.println("Enter Email:");
            String email = sc.next();
            System.out.println("Enter Date of Birth (YYYY-MM-DD):");
            String dob = sc.next();

            Student s = new Student(name, gender, register, email, dob);
            sd.insert(s);

        } else if (choice == 2) {
            System.out.println("Enter Register No to Delete:");
            int register = sc.nextInt();
            sd.delete(register);

        } else if (choice == 3) {
            System.out.println("Enter Register No to Find:");
            int register = sc.nextInt();
            sd.find(register);

        } else if (choice == 4) {
            sd.findAll();

        } else {
            System.out.println("Invalid choice!");
        }
    }
}