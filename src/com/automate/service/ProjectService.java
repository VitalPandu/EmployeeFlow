package com.automate.service;

import com.automate.framework.ProjectIdGenerator;
import com.automate.model.Project;
import com.automate.repository.ProjectRepository;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectService {
    private final ProjectRepository projectRepository = new ProjectRepository();
    private final ProjectIdGenerator projectId= new ProjectIdGenerator();

    public void createProject(String name, Date startDate, Date endDate,int numberOfEmployees) {
    Project project= new Project(name,startDate,endDate,projectId.projectIdGenerator(),numberOfEmployees);
    projectRepository.saveProject(project);
    }

    public void updateProjectDetails(String projectId, String projectName, Date startDate, Date endDate, int noOfEmployees) {
    }
}
