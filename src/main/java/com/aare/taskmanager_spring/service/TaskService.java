package com.aare.taskmanager_spring.service;

import com.aare.taskmanager_spring.exceptions.ApplicationException;
import com.aare.taskmanager_spring.repository.Task;
import com.aare.taskmanager_spring.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void addTask(String task_name, String task_deadline_string){
        //EXCEPTION - task_name can not be null, blank and task_deadline_string can not be empty
        if (task_name == null || task_name.isBlank()){
            throw new ApplicationException("Task field can't be empty!");
        } else if (task_deadline_string.equals("")){
            throw new ApplicationException("Please pick a date and time!");
        }
        //Activating datetime formatter in desired datetime format
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

        //turning task_deadline from String to LocalDateTime
        LocalDateTime task_deadline = LocalDateTime.parse(task_deadline_string, formatter);

        //creating task_created LocalDateTime
        LocalDateTime task_created = LocalDateTime.now();

        //EXCEPTION - task_deadline can not be before task_created
        if (task_deadline.isBefore(task_created)){
            throw new ApplicationException("Hey! The deadline can not be in the past!");
        }
        //sending task_name and task_deadline to Repository layer
        taskRepository.addTask(task_name, task_created, task_deadline);
    }

    public void updateStatus(int id){
        taskRepository.updateStatus(id);
    }

    public List<Task> displayTaskTable(){
        return taskRepository.displayTaskTable();
    }
}
