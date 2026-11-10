package com.projetoIntegrador.Clinica_Odontologica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_medicos")

public class MedicoDentista extends Dados {
    @Column(nullable = false, length = 100)
    private String especialidade;
    @Column (nullable = false, unique = true, length = 100)
    private String crm;

}
