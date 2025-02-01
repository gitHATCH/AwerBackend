package com.tasksmanager.tasksmanager.repo;

import com.tasksmanager.tasksmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

/* Repository de una tarea */