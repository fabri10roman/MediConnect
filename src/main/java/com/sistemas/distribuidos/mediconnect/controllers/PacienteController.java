package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.models.PacienteModel;
import com.sistemas.distribuidos.mediconnect.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ArrayList<PacienteModel> obtenerPacientes (){
        return pacienteService.obtenerPacientes();
    }

    @GetMapping("/deudas/{CI}")
    public Long obtenerDeudas(@PathVariable Long CI){
        return pacienteService.obtenerDeudas(CI);
    }

    @PostMapping(value ="/registro")
    public PacienteModel registrarPaciente (@RequestBody PacienteModel paciente){
        return this.pacienteService.registrarPaciente(paciente);
    }


}
