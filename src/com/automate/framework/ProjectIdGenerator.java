package com.automate.framework;

public class ProjectIdGenerator {

    private String projectId;
    private int i=1;
    public String projectIdGenerator(){
        return "PROJECT"+(i++);
    }

}
