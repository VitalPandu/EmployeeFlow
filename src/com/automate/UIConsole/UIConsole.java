package com.automate.UIConsole;

import com.automate.controller.EmployeeController;
import java.util.Scanner;

import static java.lang.System.*;
public class UIConsole {

    private static EmployeeController employeeController= new EmployeeController();
    private static Scanner sc = new Scanner(in);

    public static void main(String[] args) {

       printDisplayMessages();
       while (true) {
           displayMenu();
           askUserChoice(sc.nextInt());
       }
    }

    private static void printDisplayMessages(){
        out.println("Hey there ! How can I help");
        out.println("I have the follow");
    }
    private static void displayMenu(){
        out.println("1.Create Employee"+"\n2.Update Employee"+"\n3.Delete Employee"
                +"\n4.List Employee");
    }

    private static void askUserChoice(int userChoice) {

        switch (userChoice) {
            case 1:
                employeeController.createEmployee(takeEmployeeName(), takeEmployeeAge(), takeEmployeeSalary());
                break;
            case 2:
                employeeController.update(takeEmployeeIdentifier(), takeEmployeeName(), takeEmployeeAge(), takeEmployeeSalary());
                break;
            case 3:
                out.println("Enter Id to delete");
                employeeController.delete(sc.nextInt());
                break;
            case 4:
                out.println("List of Employees in the System are : " + employeeController.listOfEmployees());
                break;
        }
    }

    private static int takeEmployeeIdentifier() {
        out.println("Enter ID to update");
        return sc.nextInt();
    }

    private static int takeEmployeeSalary() {
        out.println("Enter Salary:");
        return sc.nextInt();
                  }
    private static String takeEmployeeName(){
        out.println("Enter Name:");
        return (sc.next());
    }
    private static int takeEmployeeAge(){
        out.println("Enter Age:");
        return sc.nextInt();
    }

}
