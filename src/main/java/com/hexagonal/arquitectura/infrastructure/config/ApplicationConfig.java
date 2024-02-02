package com.hexagonal.arquitectura.infrastructure.config;

import com.hexagonal.arquitectura.application.services.TaskService;
import com.hexagonal.arquitectura.application.usecases.*;
import com.hexagonal.arquitectura.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.hexagonal.arquitectura.domain.ports.out.ExternalServicePort;
import com.hexagonal.arquitectura.domain.ports.out.TaskRepositoryPort;
import com.hexagonal.arquitectura.infrastructure.adapters.ExternalServiceAdapter;
import com.hexagonal.arquitectura.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase ) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
                );
    }
    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        return jpaTaskRepositoryAdapter;
    }
    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }
}
