package com.sistemas.distribuidos.mediconnect.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "paciente")
public class PacienteModel {
    @Id
    private Long cedula;
    private String nombre;
    private String apellido;

    private Character sexo;
    @Temporal(TemporalType.DATE)
    private Date nacimiento;
    private Integer deudas;

    public PacienteModel(Long cedula, String nombre, String apellido, Character sexo, Date nacimiento, Integer deudas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.deudas = deudas;
    }

    public PacienteModel() {
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Integer getDeudas() {
        return deudas;
    }

    public void setDeudas(Integer deudas) {
        this.deudas = 0;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sexo=" + sexo +
                ", nacimiento=" + nacimiento +
                '}';
    }
}