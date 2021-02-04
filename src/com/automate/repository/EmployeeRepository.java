package com.automate.repository;

import com.automate.controller.EmployeeController;
import com.automate.model.Employee;

import java.time.LocalDate;
import java.util.*;

public class EmployeeRepository {
    private final Map<Integer,Employee> employeeData= new HashMap<>();

         public void saveEmployee(int identifier,Employee employee) {
         employeeData.put(identifier,employee);
             }

        public Employee retrive(int identifier) {
        return employeeData.get(identifier);
        }

        public boolean delete(int identifier){
        if (employeeData.containsKey(identifier))
            employeeData.remove(identifier);
            return true;
        }
        public Collection listingEmployes(){
            return employeeData.values();
        }
}

