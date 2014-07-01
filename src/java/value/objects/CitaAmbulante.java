/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package value.objects;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Roberto
 */
public class CitaAmbulante {

    private String paciente;
    private String medico;
    private String descripcion;
    private Date fechaCita;
    private Time horaInicio;
    private Time horaFin;

    public CitaAmbulante() {
    }

    public CitaAmbulante(String paciente, String medico, String descripcion, Date fechaCita, Time horaInicio, Time horaFin) {
        this.paciente = paciente;
        this.medico = medico;
        this.descripcion = descripcion;
        this.fechaCita = fechaCita;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

}
