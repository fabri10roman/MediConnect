package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.models.CitaModel;
import com.sistemas.distribuidos.mediconnect.models.ConsultaModel;
import com.sistemas.distribuidos.mediconnect.models.FechaModel;
import com.sistemas.distribuidos.mediconnect.services.CitaService;
import com.sistemas.distribuidos.mediconnect.services.FechaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @Autowired
    private FechaService fechaService;

    @GetMapping(value = "/agendar")
    public CitaModel agendarCita(@RequestBody CitaModel cita){

        ArrayList<FechaModel> model = fechaService.findByCiAndFecha(cita.getCiEspecialista(),cita.getFecha());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("************************************************");
        System.out.println(cita.getCiEspecialista());
        System.out.println(cita.getFecha());
        System.out.println(fechaService.findById(2L).getFecha());
        System.out.println("************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        if (model.size() > 0){
            return this.citaService.agendarCita(cita);
        }
        return null;
    }
}
