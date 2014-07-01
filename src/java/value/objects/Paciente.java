/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package value.objects;

import java.util.Objects;

/**
 *
 * @author Roberto
 */
public class Paciente {
   
    private String codPaciente;
    private String nombre;
    private String localizacion; 

    public Paciente() {
    }

    public Paciente(String codPaciente, String nombre, String localizacion) {
        this.codPaciente = codPaciente;
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.codPaciente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        return true;
    }
    
    
}
