package com.sistemas.distribuidos.mediconnect.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table (name = "fechas")

public class FechaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Long ci;

    private Date fecha;

    public FechaModel(Integer id, Long ci, Date fecha) {
        this.id = id;
        this.ci = ci;
        this.fecha = fecha;
    }

    public FechaModel() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCi() {
        return ci;
    }

    public void setCi(Long ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "FechaModel{" +
                "id=" + id +
                ", ci=" + ci +
                ", fecha=" + fecha +
                '}';
    }
}
