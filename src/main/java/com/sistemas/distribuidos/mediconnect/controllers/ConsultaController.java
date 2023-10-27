package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.exception.BadRequestException;
import com.sistemas.distribuidos.mediconnect.models.ConsultaModel;

import com.sistemas.distribuidos.mediconnect.models.EspecialistaModel;
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
    private PacienteService pacienteService;

    @Autowired
    private EspecialistaService especialistaService;

    @PostMapping("/registrar")
    public ConsultaModel registrarConsulta (@RequestBody ConsultaModel consulta) {


        if (pacienteService.obtenerPorCi(consulta.getCiPaciente()) == null){
            throw new BadRequestException("Verifica el CI del paciente");
        }

        try {
            EspecialistaModel especialista = especialistaService.obtenerPorCi(consulta.getCiEspecialista());
        } catch (Exception e) {
            throw new BadRequestException("Verifica el CI del especialista");
        }


        return this.consultaService.registrarConsulta(consulta);

    }

}
