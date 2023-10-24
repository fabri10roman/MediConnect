package com.sistemas.distribuidos.mediconnect.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "paciente")
public class PacienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pacienteId;
    private Long cedula;
    private String nombre;
    private String apellido;

    private String sexo;
    @Temporal(TemporalType.DATE)
    private Date nacimiento;
    private Long deudas;

    public PacienteModel(Integer pacienteId, Long cedula, String nombre, String apellido, String sexo, Date nacimiento, Long deudas) {
        this.pacienteId = pacienteId;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.deudas = deudas;
    }

    public PacienteModel() {
    }

    public Integer getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Integer pacienteId) {
        this.pacienteId = pacienteId;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Long getDeudas() {
        return deudas;
    }

    public void setDeudas(Long deudas) {
        this.deudas = deudas;
    }

    @Override
    public String toString() {
        return "PacienteModel{" +
                "pacienteId=" + pacienteId +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sexo='" + sexo + '\'' +
                ", nacimiento=" + nacimiento +
                ", deudas=" + deudas +
                '}';
    }
}