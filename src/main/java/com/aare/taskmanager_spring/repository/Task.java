package com.aare.taskmanager_spring.repository;

import java.util.Date;

public class Task {
    private int id;
    private String taskName;
    private Date taskCreated;
    private Date taskDeadline;
    private Boolean taskStatus;

    //1st use alt+insert/Constructor/choose nothing -> will create empty constructor
    public Task() {
    }
    //2nd use alt+insert/Constructor/choose all variables -> will create full constructor
    public Task(int id, String taskName, Date taskCreated, Date taskDeadline, Boolean taskStatus) {
        this.id = id;
        this.taskName = taskName;
        this.taskCreated = taskCreated;
        this.taskDeadline = taskDeadline;
        this.taskStatus = taskStatus;
    }
    //3rd use alt+insert/Getter and Setter/choose all variables -> will create all the getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getTaskCreated() {
        return taskCreated;
    }

    public void setTaskCreated(Date taskCreated) {
        this.taskCreated = taskCreated;
    }

    public Date getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDeadline(Date taskDeadline) {
        this.taskDeadline = taskDeadline;
    }

    public Boolean getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Boolean taskStatus) {
        this.taskStatus = taskStatus;
    }
}
