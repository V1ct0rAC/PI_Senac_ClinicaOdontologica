package com.projetoIntegrador.Clinica_Odontologica.controller;

import com.projetoIntegrador.Clinica_Odontologica.dto.PacienteCadastroDto;
import com.projetoIntegrador.Clinica_Odontologica.model.Paciente;
import com.projetoIntegrador.Clinica_Odontologica.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository repository;

    @PostMapping
    public ResponseEntity<String> cadastrar (@RequestBody @Valid PacienteCadastroDto pacienteCadastro){
        Paciente paciente = new Paciente();
        paciente.setNome(pacienteCadastro.nome());
        paciente.setCpf(pacienteCadastro.cpf());
        paciente.setTelefone(pacienteCadastro.telefone());
        paciente.setEmail(pacienteCadastro.email());

        repository.save(paciente);
        return ResponseEntity.ok("Paciente cadastrado");
    }

    @GetMapping
    public ResponseEntity<List<Paciente>>listar(){
        List<Paciente>lista = repository.findAll();
        return ResponseEntity.ok(lista);

    }

}
