package com.cognixia.jump.employees;

import java.util.Scanner;

public class UserInterface {
    public static void createScreen() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Please enter first name: ");
            String lastName = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
