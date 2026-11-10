package com.projetoIntegrador.Clinica_Odontologica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table (name = "tb_paciente")
@Data
@NoArgsConstructor

public class Paciente extends Dados{
    @Column(name="numero_convenio", length = 30)
    private String numeroConvenio;
    @Column (columnDefinition = "TEXT")
    private String observacaoMedica;

}
