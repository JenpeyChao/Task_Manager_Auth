package com.example.Task_Manager_Auth.Services;

import com.example.Task_Manager_Auth.Entity.Task;
import com.example.Task_Manager_Auth.Repository.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    public TaskDAO task;

    @Override
    public List<Task> getTasks() {
        return this.task.findAll();
    }

    @Override
    public Task getTaskId(long taskId) {
        Optional<Task> check = this.task.findById(taskId);
        Task task = null;
        if (check.isPresent()){
            task = check.get();
        }else{
            throw new RuntimeException(taskId+ " Not Found");
        }

        return task;
    }

    @Override
    public Task updateTask(Task task) {
        return this.task.save(task);
    }

    @Override
    public Task addTask(Task task) {
        return this.task.save(task);
    }

    @Override
    public String removeTask(long taskId) {
        this.task.deleteById(taskId);
        return "Successfully deleted the task";
    }
}
