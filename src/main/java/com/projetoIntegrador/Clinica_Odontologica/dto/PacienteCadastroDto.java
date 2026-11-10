package com.projetoIntegrador.Clinica_Odontologica.dto;


import jakarta.validation.constraints.NotBlank;

public record PacienteCadastroDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @NotBlank (message = "O CPF é obrigatório")
        String cpf,

        String telefone,

        @NotBlank (message = "O email é obrigatório")
        String email

) {}
