package com.projetoIntegrador.Clinica_Odontologica.controller;

import com.projetoIntegrador.Clinica_Odontologica.dto.MedicoDentistaCadastroDto;
import com.projetoIntegrador.Clinica_Odontologica.model.MedicoDentista;
import com.projetoIntegrador.Clinica_Odontologica.repository.MedicoDentistaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/medicodentista")
public class MedicoDentistaController {
    @Autowired
    private MedicoDentistaRepository medicoDentistaRepository;

    @PostMapping
    public ResponseEntity<String> cadastrar (@RequestBody @Valid MedicoDentistaCadastroDto medicoDentistaCadastroDto){
        MedicoDentista medicoDentista = new MedicoDentista();
        medicoDentista.setNome(medicoDentistaCadastroDto.nome());
        medicoDentista.setCpf(medicoDentistaCadastroDto.cpf());
        medicoDentista.setCrm(medicoDentistaCadastroDto.crm());
        medicoDentista.setEspecialidade(medicoDentistaCadastroDto.especialidade());
        medicoDentista.setEmail(medicoDentistaCadastroDto.email());
        medicoDentista.setTelefone(medicoDentistaCadastroDto.telefone());

        medicoDentistaRepository.save(medicoDentista);
        return ResponseEntity.ok("Médico cadastrado");

    }
    @GetMapping
    public ResponseEntity<List<MedicoDentista>>listar(){
        List<MedicoDentista>lista = medicoDentistaRepository.findAll();
        return ResponseEntity.ok(lista);
    }

}
