package com.sistemas.distribuidos.mediconnect.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table (name = "fechas")

public class FechaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Long ci;

    private Date fecha;

    private Integer cantidadConsultas;

    public FechaModel(Integer id, Long ci, Date fecha, Integer cantidadConsultas) {
        this.id = id;
        this.ci = ci;
        this.fecha = fecha;
        this.cantidadConsultas = cantidadConsultas;
    }

    public FechaModel() {
    }

    public Integer getCantidadConsultas() {
        return cantidadConsultas;
    }

    public void setCantidadConsultas(Integer cantidadConsultas) {
        this.cantidadConsultas = cantidadConsultas;
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
                ", cantidadConsultas=" + cantidadConsultas +
                '}';
    }
}
