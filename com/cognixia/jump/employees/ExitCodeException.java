package com.cognixia.jump.employees;

import java.util.InputMismatchException;

public class ExitCodeException extends InputMismatchException {
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        Application.clear();
        return "exit";
    }
}
