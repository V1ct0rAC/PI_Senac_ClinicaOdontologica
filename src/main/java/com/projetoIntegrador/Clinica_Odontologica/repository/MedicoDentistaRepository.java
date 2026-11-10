package com.projetoIntegrador.Clinica_Odontologica.repository;

import com.projetoIntegrador.Clinica_Odontologica.model.MedicoDentista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MedicoDentistaRepository extends JpaRepository<MedicoDentista, UUID> {
}
