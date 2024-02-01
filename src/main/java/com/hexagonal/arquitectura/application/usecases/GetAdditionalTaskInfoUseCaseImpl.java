package com.hexagonal.arquitectura.application.usecases;

import com.hexagonal.arquitectura.domain.models.AdditionalTaskInfo;
import com.hexagonal.arquitectura.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.hexagonal.arquitectura.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {
    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
