package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.services.EspecialistaService;
import com.sistemas.distribuidos.mediconnect.services.FechaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;

@RestController
@RequestMapping("/fechas")
public class FechaController {

    @Autowired
    private FechaService fechaService;

    @Autowired
    private EspecialistaService especialistaService;
    @GetMapping("/{CI}")
    public ArrayList<Date> obtenerFechas (@PathVariable Long CI){
        if (especialistaService.obtenerPorCi(CI).isPresent()){
            return fechaService.obtenerFechas(CI);
        }
        System.out.println("Verifica que el CI del especialista sea el correcto");
        return null;
    }
}
