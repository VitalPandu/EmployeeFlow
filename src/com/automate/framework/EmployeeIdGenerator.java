package com.automate.framework;

public class EmployeeIdGenerator {

    private int identifier=1;
    public int identifier(){
        return identifier++;
    }
}
