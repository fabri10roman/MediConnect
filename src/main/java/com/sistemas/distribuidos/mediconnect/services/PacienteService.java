package com.sistemas.distribuidos.mediconnect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.sistemas.distribuidos.mediconnect.repositories.PacienteRepository;
import com.sistemas.distribuidos.mediconnect.models.PacienteModel;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    public PacienteModel registrarPaciente(PacienteModel paciente){
        return pacienteRepository.save(paciente);
    }
}
