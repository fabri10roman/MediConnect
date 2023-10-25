package com.sistemas.distribuidos.mediconnect.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "fechas")

public class FechaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Long ciEspecialista;
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @ManyToOne
    private EspecialistaModel especialista;

    public FechaModel(Integer id, Long ciEspecialista, Date fecha) {
        this.id = id;
        this.ciEspecialista = ciEspecialista;
        this.fecha = fecha;
    }

    public FechaModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "FechaModel{" +
                "id=" + id +
                ", ciEspecialista=" + ciEspecialista +
                ", fecha=" + fecha +
                '}';
    }
}
