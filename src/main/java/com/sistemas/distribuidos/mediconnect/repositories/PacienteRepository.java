package com.sistemas.distribuidos.mediconnect.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sistemas.distribuidos.mediconnect.models.PacienteModel;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteModel, Long> {

    Optional<PacienteModel> findBycedula (Long ci);
}
