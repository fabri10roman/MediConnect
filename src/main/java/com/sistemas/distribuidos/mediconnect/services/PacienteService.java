package com.sistemas.distribuidos.mediconnect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sistemas.distribuidos.mediconnect.repositories.PacienteRepository;
import com.sistemas.distribuidos.mediconnect.models.PacienteModel;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    public PacienteModel registrarPaciente(PacienteModel paciente){

        return pacienteRepository.save(paciente);
    }

    public ArrayList<PacienteModel> obtenerPacientes(){
        return (ArrayList<PacienteModel>) pacienteRepository.findAll();
    }

    public Long obtenerDeudas(Long id){
        return pacienteRepository.findById(id).get().getDeudas();
    }

    public Optional<PacienteModel> obtenerPorCi (Long ci) {
        return pacienteRepository.findById(ci);
    }

}
