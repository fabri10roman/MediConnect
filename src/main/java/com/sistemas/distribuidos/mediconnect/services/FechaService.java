package com.sistemas.distribuidos.mediconnect.services;

import com.sistemas.distribuidos.mediconnect.models.FechaModel;
import com.sistemas.distribuidos.mediconnect.repositories.FechaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.sql.Date;
import java.util.Optional;

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


    public Optional<FechaModel> findByCiAndFechaAndCantidadConsulta (Long ci, Date fecha){
        return fechaRepository.findByCiAndFechaAndCantidadConsulta(ci, fecha);
    }

}
