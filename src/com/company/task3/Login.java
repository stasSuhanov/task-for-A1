package com.company.task3;

public class Login {
    private String Application;
    private String AppAccountName;
    private String IsActive;
    private String JobTitle;
    private String Department;

    public Login(String application, String appAccountName, String isActive, String jobTitle, String department) {
        Application = application;
        AppAccountName = appAccountName;
        IsActive = isActive;
        JobTitle = jobTitle;
        Department = department;
    }

    public String getApplication() {
        return Application;
    }

    public String getAppAccountName() {
        return AppAccountName;
    }

    public String getIsActive() {
        return IsActive;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public String getDepartment() {
        return Department;
    }
}
