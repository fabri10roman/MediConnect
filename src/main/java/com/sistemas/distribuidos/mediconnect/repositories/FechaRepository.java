package com.sistemas.distribuidos.mediconnect.repositories;

import com.sistemas.distribuidos.mediconnect.models.FechaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public interface FechaRepository extends JpaRepository<FechaModel, Long> {

    @Query("select f from FechaModel f where f.ci = ?1")
    ArrayList<Date> findByCi(Long ci);

    ArrayList<FechaModel> findByCiAndFecha(Long ci, Date fecha);
}
