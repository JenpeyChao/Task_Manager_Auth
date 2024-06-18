package com.example.Task_Manager_Auth.Controller;

import com.example.Task_Manager_Auth.Entity.Task;
import com.example.Task_Manager_Auth.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TaskControllers{

    @Autowired
    public TaskService task;

    @GetMapping("/")
    public String home(){
        return "<h1>Task Manger </h1>";
    }

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return this.task.getTasks();
    }

    @GetMapping("/tasks/{taskId}")
    public Task getTaskId(@PathVariable long taskId){
        return this.task.getTaskId(taskId);
    }

    @PutMapping("/tasks")
    public Task updateTask(@RequestBody Task task){
        return this.task.updateTask(task);
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task){
        return this.task.addTask(task);
    }
    @DeleteMapping("/tasks/{taskId}")
    public String removeTask(@PathVariable long taskId){
        return this.task.removeTask(taskId);
    }
}
