package com.sistemas.distribuidos.mediconnect.services;

import com.sistemas.distribuidos.mediconnect.models.EspecialistaModel;
import com.sistemas.distribuidos.mediconnect.models.FechaModel;
import com.sistemas.distribuidos.mediconnect.repositories.FechaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Service
public class FechaService {

    @Autowired
    private FechaRepository fechaRepository;

    public void registrarFecha(FechaModel fecha){
        fechaRepository.save(fecha);
    }

    public ArrayList<Date> obtenerFechas (Long ci){

        return fechaRepository.findByCiAndCantidadConsultas(ci);
    }


    public ArrayList<FechaModel> findByCiAndFechaAndCantidadConsulta (Long ci, Date fecha){
        return fechaRepository.findByCiAndFechaAndCantidadConsulta(ci, fecha);
    }


    // Esto es una prueba para agendar cita
    public FechaModel findById(Long id){
        return fechaRepository.findById(id).get();
    }
}
