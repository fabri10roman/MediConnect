package com.sistemas.distribuidos.mediconnect.services;

import com.sistemas.distribuidos.mediconnect.models.CitaModel;
import com.sistemas.distribuidos.mediconnect.repositories.CitaRepository;
import com.sistemas.distribuidos.mediconnect.repositories.FechaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public CitaModel agendarCita (CitaModel cita){
        return citaRepository.save(cita);
    }
}
