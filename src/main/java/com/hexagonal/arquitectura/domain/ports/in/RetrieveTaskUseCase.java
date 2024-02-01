package com.hexagonal.arquitectura.domain.ports.in;

import com.hexagonal.arquitectura.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTask(Long id);

    List<Task> getAllTask();
}
