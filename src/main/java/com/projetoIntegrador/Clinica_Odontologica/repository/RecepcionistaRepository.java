package com.projetoIntegrador.Clinica_Odontologica.repository;

import com.projetoIntegrador.Clinica_Odontologica.model.Recepcionista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecepcionistaRepository extends JpaRepository<Recepcionista, UUID> {
}
