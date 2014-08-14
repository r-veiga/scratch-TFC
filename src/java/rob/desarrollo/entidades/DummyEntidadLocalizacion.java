/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rob.desarrollo.entidades;

/**
 *
 * @author Roberto
 */
public class DummyEntidadLocalizacion {
    
    private String localizacion;
    private boolean ocupado;
    private String fkPaciente;

    public DummyEntidadLocalizacion() {
    }

    public DummyEntidadLocalizacion(String localizacion) {
        this.localizacion = localizacion;
        this.ocupado = false;
        this.fkPaciente = null;
    }

    public DummyEntidadLocalizacion(String localizacion, boolean ocupado, String fkPaciente) {
        this.localizacion = localizacion;
        this.ocupado = ocupado;
        this.fkPaciente = fkPaciente;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getFkPaciente() {
        return fkPaciente;
    }

    public void setFkPaciente(String fkPaciente) {
        this.fkPaciente = fkPaciente;
    }
    
}
