package com.cognixia.jump.employees;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class UserInterface {
    private static Scanner scanner;
    private static String[] fields = {"first name", "last name", "employee id", "employment date", "salary", "department"};
    private static HashMap<String, String> EmployeeData = new HashMap<>();
    private static int count = 1;

    static void createScreen(Scanner scannerObject) {
        System.out.println("\nCreate a new Employee\n");
        scanner = scannerObject;
        Arrays.stream(fields).forEach((field) -> askData(field));
        DataStore.insert(new HashMap<String, String>(EmployeeData));
        callMenu();
    }
    static void readScreen(Scanner scannerObject) {
        System.out.println("\nList Employee Information\n");
        DataStore.get().forEach(System.out::println);
        System.out.println("\nPress any key to exit this:\n");
        scannerObject.nextLine();
        callMenu();
    }
    static void updateScreen(Scanner scannerObject) {
        // field selection menu
        System.out.println("\nUpdate Employee Information\n");
        Arrays.stream(fields).forEach((field) -> {Application.option(count + ". " + field); count++;});
        System.out.println("\nPress any key to exit\n");
        int selected = scannerObject.nextInt();
        String[] update = {fields[selected-1], null};
        Application.clear();
        scanner.nextLine();

        //reset count
        count = 1;

        //update form menu
        System.out.println("\nUpdate Employee Information\n");
        System.out.print("Enter employee id: ");
        String employeeId = scannerObject.nextLine();
        System.out.print("Enter new value: ");
        update[1] = scannerObject.nextLine();
        
        DataStore.update(employeeId, update);
        callMenu();
    }
    static void deleteScreen(Scanner scannerObject) {
        System.out.println("\nDelete Employee Information\n");
        System.out.print("Enter employee id: ");
        String employeeId = scannerObject.nextLine();

        DataStore.delete(employeeId);
        callMenu();
    }

    private static void askData(String field) {
        System.out.print("Enter " + field + ":  ");
        EmployeeData.put(field, scanner.nextLine());
    }

    private static void callMenu() {
        Application.menu();
}
}
