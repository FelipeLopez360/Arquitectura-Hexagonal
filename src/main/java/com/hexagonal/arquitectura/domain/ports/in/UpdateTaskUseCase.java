package com.hexagonal.arquitectura.domain.ports.in;

import com.hexagonal.arquitectura.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {

    Optional<Task> updateTask(Long id, Task updateTask);
}
