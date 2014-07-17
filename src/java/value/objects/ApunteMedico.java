/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package value.objects;

import java.util.Date;

/**
 *
 * @author Roberto
 */
public class ApunteMedico {
    
    private String  idApunte;
    private Date    fechaApunte;
    private String  doctor;
    private Integer idPaciente;
    private String  apunte;

    public ApunteMedico() {
    }

    public ApunteMedico(String idApunte, Date fechaApunte, String doctor, Integer idPaciente, String apunte) {
        this.idApunte = idApunte;
        this.fechaApunte = fechaApunte;
        this.doctor = doctor;
        this.idPaciente = idPaciente;
        this.apunte = apunte;
    }

    public ApunteMedico(Date fechaApunte, String doctor, Integer idPaciente, String apunte) {
        this.fechaApunte = fechaApunte;
        this.doctor = doctor;
        this.idPaciente = idPaciente;
        this.apunte = apunte;
    }

    public String getIdApunte() {
        return idApunte;
    }

    public void setIdApunte(String idApunte) {
        this.idApunte = idApunte;
    }

    public Date getFechaApunte() {
        return fechaApunte;
    }

    public void setFechaApunte(Date fechaApunte) {
        this.fechaApunte = fechaApunte;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getApunte() {
        return apunte;
    }

    public void setApunte(String apunte) {
        this.apunte = apunte;
    }
    
    public String leerApunte(){
        StringBuffer mensaje = null;
        mensaje.append( "<strong>" );
        mensaje.append( fechaApunte );
        mensaje.append("<br/>");
        mensaje.append( doctor );
        mensaje.append( "</strong>" );
        mensaje.append("<br/>-----------------<br/>");
        mensaje.append( apunte );
        
        return mensaje.toString();
    }
}
