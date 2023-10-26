package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.models.ConsultaModel;

import com.sistemas.distribuidos.mediconnect.services.ConsultaService;
import com.sistemas.distribuidos.mediconnect.services.EspecialistaService;
import com.sistemas.distribuidos.mediconnect.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @Autowired
    private EspecialistaService especialistaService;

    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/registrar")
    public ConsultaModel registrarConsulta (@RequestBody ConsultaModel consulta) {
        if (especialistaService.obtenerPorCi(consulta.getCiEspecialista()).isPresent() && pacienteService.obtenerPorCi(consulta.getCiPaciente()).isPresent()) {
            return this.consultaService.registrarConsulta(consulta);
        }
        System.out.println("Verifica que el CI del paciente y el CI del especialista sea correcto");
        return null;
    }

}
