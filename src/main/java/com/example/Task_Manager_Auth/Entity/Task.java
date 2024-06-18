package com.example.Task_Manager_Auth.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "taskId")
    public long taskId;

    @Column(name = "taskName")
    public String taskName;
    @Column(name = "taskDescription")
    public String taskDescription;
}