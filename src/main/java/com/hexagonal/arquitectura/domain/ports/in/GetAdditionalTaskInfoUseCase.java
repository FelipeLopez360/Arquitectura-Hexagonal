package com.hexagonal.arquitectura.domain.ports.in;

import com.hexagonal.arquitectura.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
