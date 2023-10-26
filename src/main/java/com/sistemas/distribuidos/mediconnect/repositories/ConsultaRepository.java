package com.sistemas.distribuidos.mediconnect.repositories;

import com.sistemas.distribuidos.mediconnect.models.ConsultaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<ConsultaModel,Long> {
}
