package com.automate.UIConsole;

import com.automate.controller.EmployeeController;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.*;
public class UIConsole {

    private static EmployeeController employeeController= new EmployeeController();
    private static Scanner sc = new Scanner(in);

    public static void main(String[] args) {
        //1. Show choices to user
        out.println("Hey there ! How can I help");
        out.println("I have the follow");
        askUserChoice();
    }

    private static void askUserChoice() {
        while(true){
        out.println("1.Create Employee"+"\n2.Update Employee"+"\n3.Delete Employee"
        +"\n4.List Employee");
        int userChoice= sc.nextInt();
        switch (userChoice) {
            case 1:
                employeeController.createEmployee(getName(), getAge(), getSalary());
                break;
            case 2:
                employeeController.update(getIdentifier(),getName(),getAge(),getSalary());
                break;
            case 3:
                out.println("Enter Id to delete");
                int id=sc.nextInt();
                employeeController.delete(id);
            case 4:
                out.println("List of Employees in the System are : "+employeeController.listOfEmployees());
        }
        }


    }

    private static int getIdentifier() {
        out.println("Enter ID to update");
        return sc.nextInt();
    }

    private static int getSalary() {
                      out.println("Enter Salary:");
                     return sc.nextInt();
                  }

                 private static String getName(){
                      out.println("Enter Name:");
                         return (sc.next());
                 }
                 private static int getAge(){
                     out.println("Enter Age:");
                     return sc.nextInt();
                 }

}
