package com.cognixia.jump.employees;

import java.util.Scanner;

public class Application {
    public static void menu() {
        System.out.println("\nWelcome to your employee management system\n");
        System.out.println("\nSelect one of the following options:\n");

        option("1. Create an Employee");
        option("2. List all Employees");
        option("3. Update an Employee");
        option("4. Delete an Employee");

        getSelected();
    }

    public static void option(String title) {
        System.out.println(title);
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
    }

    public static void getSelected() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            int selected = scanner.nextInt();
            clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
