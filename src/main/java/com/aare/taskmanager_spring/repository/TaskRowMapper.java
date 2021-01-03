package com.aare.taskmanager_spring.repository;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskRowMapper implements RowMapper<Task> {
    @Override
    public Task mapRow(ResultSet resultSet, int i) throws SQLException{
        Task task = new Task();
        task.setId((resultSet.getInt("id")));
        task.setTaskName(resultSet.getString("task_name"));
        task.setTaskCreated(resultSet.getTimestamp("task_created"));
        task.setTaskDeadline(resultSet.getTimestamp("task_deadline"));
        task.setTaskStatus(resultSet.getBoolean("task_status"));
        return task;
    }
}
