package com.aare.taskmanager_spring.repository;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.naming.Name;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TaskRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    //Adding one row (Task) into database
    public void addTask(String task_name, LocalDateTime task_created, LocalDateTime task_deadline) {
        String sql = "INSERT INTO task_table (task_name, task_created, task_deadline, task_status) VALUES (:x1, :x2, :x3, :x4)";
        Map<String, Object> paraMap = new HashMap<>();
        paraMap.put("x1", task_name);
        paraMap.put("x2", task_created);
        paraMap.put("x3", task_deadline);
        paraMap.put("x4", "false");
        jdbcTemplate.update(sql, paraMap);
    }

    //Updating Task status in database
    public void updateStatus(int id){
        String sql = "UPDATE task_table SET task_status = true WHERE id = :x1";
        Map<String, Object> paraMap = new HashMap<>();
        paraMap.put("x1", id);
        jdbcTemplate.update(sql, paraMap);
    }

    //Displaying Tasks table where status is false
    public List<Task> displayTaskTable(){
        String sql = "SELECT * FROM task_table WHERE task_status = 'false' ORDER BY task_deadline ASC";
        Map<String, Object> paraMap = new HashMap<>();
        return jdbcTemplate.query(sql, paraMap, new TaskRowMapper());
    }
}
