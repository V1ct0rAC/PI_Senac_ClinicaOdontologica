package com.projetoIntegrador.Clinica_Odontologica.dto;

import jakarta.validation.constraints.NotBlank;

public record MedicoDentistaCadastroDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @NotBlank (message = "O CPF é obrigatório")
        String cpf,

        @NotBlank (message = "O CRM é obrigatório")
        String crm,

        @NotBlank (message = "A especialidade é obrigatória")
        String especialidade,

        String telefone,

        String email
) {
}
