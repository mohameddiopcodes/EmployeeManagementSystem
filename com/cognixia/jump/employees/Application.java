package com.cognixia.jump.employees;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    private static final int exitCode = 5;

    public static void run() {
            menu();

    }

    private static void menu() {
            System.out.println("\nWelcome to your employee management system\n");
            System.out.println("\nSelect one of the following options:\n");
    
            option("1. Create an Employee");
            option("2. List all Employees");
            option("3. Update an Employee");
            option("4. Delete an Employee");
            option("5. Exit");
    
            getSelected();
    }

    private static void option(String title) {
        System.out.println(title);
    }

    private static void clear() {
        System.out.print("\033[H\033[2J");
    }

    private static void getSelected() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            int selected = scanner.nextInt();
            clear();
            if(selected != exitCode) menu();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
