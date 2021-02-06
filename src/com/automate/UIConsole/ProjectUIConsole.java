package com.automate.UIConsole;

import com.automate.controller.ProjectController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProjectUIConsole {
    private final static ProjectController projectController =new ProjectController();
    private final static Scanner sc= new Scanner(System.in);
    private final static SimpleDateFormat simpleDateFormat= new SimpleDateFormat("mm/dd/yyyy");


    public static void main(String[] args) throws ParseException {
       while(true) {
           callingMethod();
       }
    }



    public static void callingMethod() throws ParseException {
        addProject(takeProjectName(),takeStartDate(),takeEndDate(),takeNumberOfEmployees());
        updateProject(takeProjectId(),takeProjectName(),takeStartDate(),takeEndDate(),takeNumberOfEmployees());
    }

    private static void addProject(String name, Date startDate, Date endDate,int numberOfEmployees){
        projectController.createProject(name, startDate,endDate,numberOfEmployees);
    }

    private static void updateProject(String projectId,String projectName,Date startDate,Date endDate,int numberOfEmployees){
        projectController.updateProject(projectId,projectName,startDate,endDate,numberOfEmployees);
    }


    private static String takeProjectId(){
        return sc.nextLine();
    }
    private static String takeProjectName(){
        System.out.println("Enter Project Name");
        return sc.nextLine();
    }

    private static Date takeStartDate() throws ParseException {
        System.out.println("Enter Start Date");
        return simpleDateFormat.parse(sc.nextLine());
    }
    private static Date takeEndDate() throws ParseException{
        System.out.println("Enter End Date");
        return simpleDateFormat.parse(sc.nextLine());
    }

    private static int takeNumberOfEmployees(){
        System.out.println("Enter number of employees required for project");
        return sc.nextInt();
    }
}
