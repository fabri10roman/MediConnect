package com.sistemas.distribuidos.mediconnect.repositories;

import com.sistemas.distribuidos.mediconnect.models.FechaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Repository
public interface FechaRepository extends JpaRepository<FechaModel, Long> {

    @Query("SELECT f.fecha FROM FechaModel f WHERE f.ci = :ci AND f.cantidadConsultas > 0")
    ArrayList<Date> findByCiAndCantidadConsultas(@Param("ci") Long ci);

    @Query("SELECT f FROM FechaModel f WHERE f.ci =:ci AND f.fecha =:fecha AND f.cantidadConsultas > 0")
    ArrayList<FechaModel> findByCiAndFechaAndCantidadConsulta (@Param("ci") Long ci, @Param("fecha") Date fecha);
    ArrayList<FechaModel> findByCiAndFecha(Long ci, Date fecha);

}
