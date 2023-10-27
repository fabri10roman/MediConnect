package com.sistemas.distribuidos.mediconnect.services;

import com.sistemas.distribuidos.mediconnect.models.EspecialistaModel;
import com.sistemas.distribuidos.mediconnect.repositories.EspecialistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EspecialistaService {

    @Autowired
    EspecialistaRepository especialistaRepository;

    public ArrayList<EspecialistaModel> obtenerEspecialistas(String especialidad){
        return especialistaRepository.findByEspecialidad(especialidad);
    }

    public EspecialistaModel obtenerPorCi (Long ci) {
        return especialistaRepository.findById(ci).get();
    }

}
