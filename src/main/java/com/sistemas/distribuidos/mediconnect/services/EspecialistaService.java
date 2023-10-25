package com.sistemas.distribuidos.mediconnect.services;

import com.sistemas.distribuidos.mediconnect.models.EspecialistaModel;
import com.sistemas.distribuidos.mediconnect.repositories.EspecialistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class EspecialistaService {

    @Autowired
    EspecialistaRepository especialistaRepository;

    public ArrayList obtenerEspecialistas(String especialidad){
        return (ArrayList<EspecialistaModel>) especialistaRepository.findByEspecialidad(especialidad);
    }

    public ArrayList obtenerDisponibilidad (Long cedula){
        ArrayList<Date> fechas = especialistaRepository.;
    }
}
