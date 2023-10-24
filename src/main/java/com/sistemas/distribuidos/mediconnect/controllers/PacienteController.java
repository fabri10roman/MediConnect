package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.models.PacienteModel;
import com.sistemas.distribuidos.mediconnect.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/registro")
    public PacienteModel registrarPaciente (PacienteModel paciente){
        return this.pacienteService.registrarPaciente(paciente);
    }


}
