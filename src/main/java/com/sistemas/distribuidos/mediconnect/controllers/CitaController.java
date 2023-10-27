package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.dto.CitaDto;
import com.sistemas.distribuidos.mediconnect.models.CitaModel;
import com.sistemas.distribuidos.mediconnect.models.FechaModel;
import com.sistemas.distribuidos.mediconnect.services.CitaService;
import com.sistemas.distribuidos.mediconnect.services.EspecialistaService;
import com.sistemas.distribuidos.mediconnect.services.FechaService;
import com.sistemas.distribuidos.mediconnect.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;



import java.sql.Date;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @Autowired
    private FechaService fechaService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private EspecialistaService especialistaService;

    @PostMapping(value = "/agendar")
    public CitaModel agendarCita(@RequestBody CitaDto cita){

        if (pacienteService.obtenerPorCi(cita.getCiPaciente()).isPresent() && especialistaService.obtenerPorCi(cita.getCiEspecialista()).isPresent()){

            Optional<FechaModel> model = fechaService.findByCiAndFechaAndCantidadConsulta(cita.getCiEspecialista(),Date.valueOf(cita.getFecha()));

            if (model.isPresent()){

                    model.get().setCantidadConsultas(model.get().getCantidadConsultas()-1);
                    fechaService.registrarFecha(new FechaModel(model.get().getId(),model.get().getCi(),model.get().getFecha(),model.get().getCantidadConsultas()));
                    return citaService.agendarCita(new CitaModel(cita.getId(),cita.getCiPaciente(),cita.getCiEspecialista(),Date.valueOf(cita.getFecha())));
            }
            else {
                System.out.println("Verificar bien la fecha o ya no existe turno posible en la fecha");
            }
        }
        else{
            System.out.println("Verifica el CI del paciente y del especialista");
        }

        return null;

    }
}
