package com.aare.taskmanager_spring.controller;

import com.aare.taskmanager_spring.repository.Task;
import com.aare.taskmanager_spring.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskService taskService;

    //adding new Task into DB
    @PostMapping("task")
    public void addTask(String task_name, String task_deadline_string){
        taskService.addTask(task_name, task_deadline_string);
    }

    //updating Task status in DB with @RequestParam
    @PutMapping("status/update")
    public void updateStatus(int id){
        taskService.updateStatus(id);
    }

    //getting the whole table of tasks where status is false
    @GetMapping("task/table")
    public List<Task> displayTaskTable(){
        return taskService.displayTaskTable();
    }
}
