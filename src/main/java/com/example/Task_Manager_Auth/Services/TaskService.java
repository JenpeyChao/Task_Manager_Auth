package com.example.Task_Manager_Auth.Services;

import com.example.Task_Manager_Auth.Entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> getTasks();
    Task getTaskId(long taskId);
    Task updateTask(Task task);
    Task addTask(Task task);
    String removeTask(long taskId);
}
