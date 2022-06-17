package com.cognixia.jump.employees;

import java.util.Scanner;

class Router {
    static void handleRequest(int selected, Scanner scanner) {
        switch(selected) {
            case 1:
                UserInterface.createScreen(scanner);
            break;
            case 2:
                UserInterface.readScreen(scanner);
            break;
            case 3:
                UserInterface.updateScreen(scanner);
            break;
            case 4:
                UserInterface.deleteScreen(scanner);
            break;
        }
    }
}
