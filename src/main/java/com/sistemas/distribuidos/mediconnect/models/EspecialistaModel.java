package com.sistemas.distribuidos.mediconnect.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "especialistas")
public class EspecialistaModel {

    @Id
    private Long cedula;
    private String nombre;
    private String apellido;
    private String especialidad;

    @OneToMany(mappedBy = "especialista")
    private List<FechaModel> fechas;

    public EspecialistaModel(Long cedula, String nombre, String apellido, String especialidad, List<FechaModel> fechas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.fechas = fechas;
    }

    public EspecialistaModel() {
    }

    public List<FechaModel> getFechas() {
        return fechas;
    }

    public void setFechas(List<FechaModel> fechas) {
        this.fechas = fechas;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "EspecialistaModel{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", fechas=" + fechas +
                '}';
    }
}
