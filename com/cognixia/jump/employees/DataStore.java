package com.cognixia.jump.employees;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class DataStore {
    private static List<HashMap<String, String>> Employees = new ArrayList<>();

    static void insert(HashMap<String, String> Employee) {
        Employees.add(Employee);
    }

    static List<HashMap<String, String>> get() {
        return Employees;
    }

    static void update(String id, String[] update) {
        try {
            if(!Employees.isEmpty()) {
                Employees.stream()
                    .filter((employee) -> employee.get("employee id").equals(id))
                    .findAny()
                    .get()
                    .merge(update[0], update[1], (oldValue, newValue) -> {return newValue;});
            }
        } catch(Exception e) {
            System.out.println("Resource Not Found");
        }
    }

    static void delete(String id) {
        try {
            if(!Employees.isEmpty()) {
                Employees = Employees.stream()
                    .filter((employee) -> !employee.get("employee id").equals(id))
                    .collect(Collectors.toList());
            }
        } catch(Exception e) {
            System.out.println("Resource Not Found");
        }
    }
}
