package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.models.ConsultaModel;
import com.sistemas.distribuidos.mediconnect.services.ConsultaService;
import com.sistemas.distribuidos.mediconnect.services.FechaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @Autowired
    private FechaService fechaService;

    @PostMapping(value = "/registrar")
    public ConsultaModel registrarConsulta (@RequestBody ConsultaModel consulta){

        if (fechaService.findByColumnLongAndColumnDate(consulta.getCiEspecialista(),consulta.getFecha()) != null){
            return this.consultaService.registrarConsulta(consulta);
        }
        return null;
    }

}
