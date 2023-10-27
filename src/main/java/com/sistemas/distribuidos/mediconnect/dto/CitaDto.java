package com.sistemas.distribuidos.mediconnect.dto;


import java.time.LocalDate;

public class CitaDto {


    private Long id;
    private Long ciPaciente;

    private Long ciEspecialista;


    private LocalDate fecha;

    public CitaDto(Long id, Long ciPaciente, Long ciEspecialista, LocalDate fecha) {
        this.id = id;
        this.ciPaciente = ciPaciente;
        this.ciEspecialista = ciEspecialista;
        this.fecha = fecha;
    }

    public CitaDto() {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
