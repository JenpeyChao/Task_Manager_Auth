package com.example.Task_Manager_Auth.Repository;

import com.example.Task_Manager_Auth.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDAO extends JpaRepository<Task,Long> {
}
