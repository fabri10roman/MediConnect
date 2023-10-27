package com.sistemas.distribuidos.mediconnect.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "consultas")
public class ConsultaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ciPaciente")
    private Long ciPaciente;
    @Column(name = "ciEspecialista")
    private Long ciEspecialista;
    private String motivo;
    private String comentarios;
    private Date fecha;

    public ConsultaModel(Long id, Long ciPaciente, Long ciEspecialista, String motivo, String comentarios, Date fecha) {
        this.id = id;
        this.ciPaciente = ciPaciente;
        this.ciEspecialista = ciEspecialista;
        this.motivo = motivo;
        this.comentarios = comentarios;
        this.fecha = fecha;
    }

    public ConsultaModel() {
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ConsultaModel{" +
                "id=" + id +
                ", ciPaciente=" + ciPaciente +
                ", ciEspecialista=" + ciEspecialista +
                ", motivo='" + motivo + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
