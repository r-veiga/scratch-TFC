/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package value.objects;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Roberto
 */
public class FicheroSubido {
   
    private String codPaciente;
    private String nombrePaciente;
    private String ruta; 
    private String nombreFichero;
    private Date fecha;

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public FicheroSubido() {
    }

    public FicheroSubido(String codPaciente, String nombrePaciente, String ruta) {
        this.codPaciente = codPaciente;
        this.nombrePaciente = nombrePaciente;
        this.ruta = ruta;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombreFichero() {
        return nombreFichero;
    }

    public void setNombreFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero;
    }

    public Date getFecha() {
        return fecha;
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
        final FicheroSubido other = (FicheroSubido) obj;
        return true;
    }
    
    
}
