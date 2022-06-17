package com.cognixia.jump.employees;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            Application.run(scanner);
        } catch (ExitCodeException e) {
            System.out.println( e.getMessage());
        } catch (InputMismatchException e) {
            Application.clear();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
