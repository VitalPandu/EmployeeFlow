package com.automate.service;

import com.automate.framework.EmployeeIdGenerator;
import com.automate.model.Employee;
import com.automate.repository.EmployeeRepository;

import java.util.Collection;

public class EmployeeService {


    private final EmployeeRepository employeeRepository=new EmployeeRepository();
    private final EmployeeIdGenerator employeeIdentifier= new EmployeeIdGenerator();

    public void createEmployee(String name, int age, int salary) {
        int identifier=employeeIdentifier.identifier();
        Employee employee = new Employee(name,age,salary, identifier);
        employeeRepository.saveEmployee(identifier,employee);
    }


    public void update(int identifier, String name, int age, int salary) {
        Employee employee= employeeRepository.retrive(identifier);
        employee.updateEmployee(name,age,salary);
        employeeRepository.saveEmployee(identifier,employee);
    }

    public void delete(int identifier) {
            employeeRepository.delete(identifier);
    }

    public Collection listOfEmployees(){
        return employeeRepository.listingEmployes();
    }
}
