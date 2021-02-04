package com.automate.controller;

import com.automate.service.EmployeeService;

import java.util.Collection;

public class EmployeeController {

    private final EmployeeService employeeService=new EmployeeService();

    public void createEmployee(String name, int age,int salary){
        employeeService.createEmployee(name,age,salary);
    }

    public void update(int identifier, String name, int age, int salary){
        if(isValidation(identifier)) {
            employeeService.update(identifier, name, age, salary);
        }
    }

    public void delete(int identifier){
        if (isValidation(identifier)){
            employeeService.delete(identifier);
        }
    }

        public Collection listOfEmployees(){
        return employeeService.listOfEmployess();
        }



    private boolean isValidation(int identifier){
        if (identifier<0){
            return false;
        }
        return true;
    }
}
