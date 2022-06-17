package com.cognixia.jump.employees;

import java.util.InputMismatchException;
import java.util.Scanner;

class Application {
    private static final int exitCode = 5;
    private static Scanner scanner;
    static void run(Scanner scannerObject) {
            scanner = scannerObject;
            menu();

    }

    static void menu() {
            System.out.println("\nWelcome to your employee management system\n");
            System.out.println("Select one of the following options:\n");
    
            option("1. Create an Employee");
            option("2. List all Employees");
            option("3. Update an Employee");
            option("4. Delete an Employee");
            option("\nPress any key to exit");
    
            getSelected();
    }

    static void clear() {
        System.out.print("\033[H\033[2J");
    }

    static void option(String title) {
        System.out.println(title);
    }

    private static void getSelected() {
            System.out.println();
            int selected = scanner.nextInt();
            clear();
            if(selected != exitCode) {
                scanner.nextLine();
                Router.handleRequest(selected, scanner);
            }
    }
}
