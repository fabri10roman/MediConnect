package com.sistemas.distribuidos.mediconnect.services;

import com.sistemas.distribuidos.mediconnect.models.ConsultaModel;
import com.sistemas.distribuidos.mediconnect.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {


    @Autowired
    private ConsultaRepository consultaRepository;

    public ConsultaModel registrarConsulta (ConsultaModel consulta){
        return consultaRepository.save(consulta);
    }

}