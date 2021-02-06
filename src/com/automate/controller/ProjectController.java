package com.automate.controller;

import com.automate.service.ProjectService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectController {
    private final ProjectService projectService=new ProjectService();

     public void createProject(String name, Date startDate, Date endDate,int numberOfEmployees){
         if (isValid(name, startDate, endDate)) {
             projectService.createProject(name, startDate, endDate,numberOfEmployees);
         }else
             System.out.println("Enter valid name or startDate or endDate");
     }



    public void updateProject(String projectId, String projectName, Date startDate, Date endDate,int noOfEmployees) {
         projectService.updateProjectDetails(projectId,projectName,startDate,endDate,noOfEmployees);
    }

    private boolean isValid(String name, Date startDate, Date endDate){
        if((name.equals("")||name==null) || startDate==null || endDate==null) {
            return false;
        }
        return true;
}
}
