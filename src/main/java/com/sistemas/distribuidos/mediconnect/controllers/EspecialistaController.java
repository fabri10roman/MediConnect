package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.models.EspecialistaModel;
import com.sistemas.distribuidos.mediconnect.services.EspecialistaService;
import com.sistemas.distribuidos.mediconnect.services.FechaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/especialistas")
public class EspecialistaController {

    @Autowired
    private EspecialistaService especialistaService;

    @Autowired
    private FechaService fechaService;

    @GetMapping(value = "/{ESPECIALIDAD}")
    public ArrayList<EspecialistaModel> obtenerEspecialistas (@PathVariable String ESPECIALIDAD){
        return especialistaService.obtenerEspecialistas(ESPECIALIDAD);
    }

}
