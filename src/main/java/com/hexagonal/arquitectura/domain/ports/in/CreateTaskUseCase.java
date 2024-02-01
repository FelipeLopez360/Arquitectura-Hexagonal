package com.hexagonal.arquitectura.domain.ports.in;

import com.hexagonal.arquitectura.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
