package com.automate.repository;

import com.automate.framework.ProjectIdGenerator;
import com.automate.model.Project;
import java.util.HashMap;
import java.util.Map;

public class ProjectRepository {

    private final ProjectIdGenerator projectId=new ProjectIdGenerator();
    private Map<String, Project> projectDetails = new HashMap<>();

    public void saveProject(Project project) {
        projectDetails.put(projectId.projectIdGenerator(),project);
        System.out.println(projectDetails);
    }
}
