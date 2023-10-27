package com.sistemas.distribuidos.mediconnect.repositories;

import com.sistemas.distribuidos.mediconnect.models.EspecialistaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EspecialistaRepository extends JpaRepository<EspecialistaModel, Long> {
    @Query("select e from EspecialistaModel e where e.especialidad = ?1")
    ArrayList<EspecialistaModel> findByEspecialidad(String especialidad);
}
