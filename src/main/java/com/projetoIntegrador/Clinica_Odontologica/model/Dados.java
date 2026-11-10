package com.projetoIntegrador.Clinica_Odontologica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Dados {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column (nullable = false, length = 100)
    private String nome;
    @Column (nullable = false, unique = true, length = 20)
    private String cpf;
    @Column (nullable = true, length = 100)
    private String telefone;
    @Column ( length = 100)
    private String email;

}
