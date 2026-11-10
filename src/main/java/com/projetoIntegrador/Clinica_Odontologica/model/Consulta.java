package com.projetoIntegrador.Clinica_Odontologica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "tb_consulta")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private MedicoDentista medicoDentista;
    private LocalDateTime localDateTime;
    private String status;

}
