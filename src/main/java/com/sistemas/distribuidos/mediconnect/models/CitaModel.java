package com.sistemas.distribuidos.mediconnect.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "citas")
public class CitaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long ciPaciente;

    private Long ciEspecialista;
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public CitaModel(Long id, Long ciPaciente, Long ciEspecialista, Date fecha) {
        this.id = id;
        this.ciPaciente = ciPaciente;
        this.ciEspecialista = ciEspecialista;
        this.fecha = fecha;
    }

    public CitaModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCiPaciente() {
        return ciPaciente;
    }

    public void setCiPaciente(Long ciPaciente) {
        this.ciPaciente = ciPaciente;
    }

    public Long getCiEspecialista() {
        return ciEspecialista;
    }

    public void setCiEspecialista(Long ciEspecialista) {
        this.ciEspecialista = ciEspecialista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "CitaModel{" +
                "id=" + id +
                ", ciPaciente=" + ciPaciente +
                ", ciEspecialista=" + ciEspecialista +
                ", fecha=" + fecha +
                '}';
    }
}
