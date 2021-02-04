package com.automate.model;

public class Employee {

    private String name;
    private int age;
    private int salary;
    private int identityNumber;

    public Employee(String name, int age, int salary, int identityNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.identityNumber = identityNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", identityNumber=" + identityNumber +
                '}';
    }

    public void updateEmployee(String name, int age, int salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}
