package com.tasksmanager.tasksmanager.service;

import com.tasksmanager.tasksmanager.model.Task;
import com.tasksmanager.tasksmanager.repo.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import java.util.List;

@Service
@Validated
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task addTask(@Valid Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task getTasksById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada con id: " + id));
    }

    public void deleteTaskById(Long id) {
        // Verifica si la tarea existe antes de intentar eliminarla
        if (taskRepository.existsById(id)) {
            taskRepository.deleteById(id);
        } else {
            throw new RuntimeException("Tarea no encontrada con id: " + id);
        }
    }
}

/* Business o lógica de negocio de las tareas */