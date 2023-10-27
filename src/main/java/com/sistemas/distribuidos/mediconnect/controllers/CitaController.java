package com.sistemas.distribuidos.mediconnect.controllers;

import com.sistemas.distribuidos.mediconnect.dto.CitaDto;
import com.sistemas.distribuidos.mediconnect.exception.BadRequestException;
import com.sistemas.distribuidos.mediconnect.exception.ServiceUnavailableException;
import com.sistemas.distribuidos.mediconnect.models.CitaModel;
import com.sistemas.distribuidos.mediconnect.models.FechaModel;
import com.sistemas.distribuidos.mediconnect.models.EspecialistaModel;
import com.sistemas.distribuidos.mediconnect.services.CitaService;
import com.sistemas.distribuidos.mediconnect.services.EspecialistaService;
import com.sistemas.distribuidos.mediconnect.services.FechaService;
import com.sistemas.distribuidos.mediconnect.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



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
    public CitaModel agendarCita(@RequestBody CitaDto cita) {


        if (pacienteService.obtenerPorCi(cita.getCiPaciente()) == null){
            throw new BadRequestException("Verifica el CI del paciente");
        }

        try {
            EspecialistaModel especialista = especialistaService.obtenerPorCi(cita.getCiEspecialista());
        } catch (Exception e) {
            throw new BadRequestException("Verifica el CI del especialista");
        }

        if(fechaService.findByCiAndFecha(cita.getCiEspecialista(), Date.valueOf(cita.getFecha())) == null) {

            throw new BadRequestException("En esa fecha el especialista no atiende");
        }

        try {
            FechaModel model = fechaService.findByCiAndFechaAndCantidadConsulta(cita.getCiEspecialista(), Date.valueOf(cita.getFecha()));
            model.setCantidadConsultas(model.getCantidadConsultas() - 1);
            return citaService.agendarCita(new CitaModel(cita.getId(), cita.getCiPaciente(), cita.getCiEspecialista(), Date.valueOf(cita.getFecha())));
        } catch (Exception e) {
            throw new ServiceUnavailableException("El especialista ya no tiene citas disponibles en esa fecha");
        }
    }
}
