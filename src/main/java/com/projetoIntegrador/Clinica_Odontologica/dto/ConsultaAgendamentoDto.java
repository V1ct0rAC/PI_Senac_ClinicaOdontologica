package com.projetoIntegrador.Clinica_Odontologica.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

public record ConsultaAgendamentoDto(
        @NotNull(message = "Identificação paciente é obrigatória")
        UUID pacienteId,

        @NotNull(message = "Identificação médico é obrigatória")
        UUID medicodentistaId,

        @NotNull(message = "Data obrigatória")
        @Future(message = "Por data futura")
        LocalDateTime data
) {
}
