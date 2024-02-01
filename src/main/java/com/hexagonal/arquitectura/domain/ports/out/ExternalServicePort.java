package com.hexagonal.arquitectura.domain.ports.out;

import com.hexagonal.arquitectura.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
