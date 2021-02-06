package com.automate.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Project {
    private String name;
    private Date startDate;
    private Date endDate;
    private String projectId;
    private int numberOfEmployees;
    public Project(String name, Date startDate, Date endDate, String projectId,int numberOfEmployees) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectId=projectId;
        this.numberOfEmployees=numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
