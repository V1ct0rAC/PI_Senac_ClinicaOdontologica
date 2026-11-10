package com.projetoIntegrador.Clinica_Odontologica.controller;

import com.projetoIntegrador.Clinica_Odontologica.dto.ConsultaAgendamentoDto;
import com.projetoIntegrador.Clinica_Odontologica.model.Consulta;
import com.projetoIntegrador.Clinica_Odontologica.model.MedicoDentista;
import com.projetoIntegrador.Clinica_Odontologica.model.Paciente;
import com.projetoIntegrador.Clinica_Odontologica.repository.ConsultaRepository;
import com.projetoIntegrador.Clinica_Odontologica.repository.MedicoDentistaRepository;
import com.projetoIntegrador.Clinica_Odontologica.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")

public class ConsultaController {
    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private MedicoDentistaRepository medicoDentistaRepository;

    @PostMapping
    public ResponseEntity<String> agendar(@RequestBody @Valid ConsultaAgendamentoDto consultaAgendamento){
        Paciente paciente = pacienteRepository.findById(consultaAgendamento.pacienteId()).
                orElseThrow(() -> new RuntimeException("Paciente não encontrado"));

        MedicoDentista medicoDentista = medicoDentistaRepository.findById(consultaAgendamento.medicodentistaId()).
                orElseThrow(()-> new RuntimeException("Médico não encontrado"));

        Consulta consulta = new Consulta();
        consulta.setPaciente(paciente);
        consulta.setMedicoDentista(medicoDentista);
        consulta.setLocalDateTime(consultaAgendamento.data());
        consulta.setStatus("Agendado");

        consultaRepository.save(consulta);
        return ResponseEntity.ok("Consulta agendado com sucesso");


        }
        @GetMapping
        public ResponseEntity<List<Consulta>>listar(){
        List<Consulta>lista = consultaRepository.findAll();
        return ResponseEntity.ok(lista);
        }

    }




