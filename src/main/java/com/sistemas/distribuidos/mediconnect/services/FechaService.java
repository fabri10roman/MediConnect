package com.sistemas.distribuidos.mediconnect.services;

import com.sistemas.distribuidos.mediconnect.models.EspecialistaModel;
import com.sistemas.distribuidos.mediconnect.models.FechaModel;
import com.sistemas.distribuidos.mediconnect.repositories.FechaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FechaService {

    @Autowired
    private FechaRepository fechaRepository;

    public ArrayList<Date> obtenerFechas (Long ci){

        return (ArrayList<Date>) fechaRepository.findByCi(ci);
    }

    public ArrayList<FechaModel> findByCiAndFecha (Long ci, Date fecha){

        return fechaRepository.findByCiAndFecha(ci, fecha);
    }


    // Esto es una prueba para agendar cita
    public FechaModel findById(Long id){
        return fechaRepository.findById(id).get();
    }
}
