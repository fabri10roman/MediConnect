package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.exception.BadRequestException;
import com.sistemas.distribuidos.mediconnect.models.PacienteModel;
import com.sistemas.distribuidos.mediconnect.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ArrayList<PacienteModel> obtenerPacientes (){
        return pacienteService.obtenerPacientes();
    }

    @GetMapping("/deudas/{CI}")
    public Long obtenerDeudas(@PathVariable Long CI){

        try{
            return pacienteService.obtenerDeudas(CI);
        }catch (Exception e){
            throw new BadRequestException("CI del paciente no existe");
        }

    }
    @PostMapping(value ="/registrar")
    public PacienteModel registrarPaciente (@RequestBody PacienteModel paciente){
        return this.pacienteService.registrarPaciente(paciente);
    }


}
