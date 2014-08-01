/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managed.beans;

import javax.inject.Named;
import java.io.Serializable;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rob.desarrollo.auxiliares.MiDummyDatabaseMB;
import rob.desarrollo.entidades.DummyEntidadPaciente;

/**
 *
 * @author Roberto
 */
@Named(value = "altaPacienteMB")
@ViewScoped
public class AltaPacienteMB implements Serializable {

    private String nombre;
    private String localizacion;
    private String DNI;
    private String telefono;
    private String direccion;

    @Inject
    private MiDummyDatabaseMB baseDeDatos;

    private static final Logger _log = LoggerFactory.getLogger(AltaPacienteMB.class);

    /**
     * Constructor. Crea una nueva instancia de AltaPacienteMB
     */
    public AltaPacienteMB() {
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String crearPaciente() {
        DummyEntidadPaciente auxPaciente = new DummyEntidadPaciente( "0", nombre, localizacion, DNI, telefono, direccion);

        _log.info( "auxPaciente.toString() ==> " + auxPaciente.toString() );
        _log.info( "baseDeDatos.toString() ==> " + baseDeDatos.toString() );
        _log.info( "baseDeDatos.getTabPacientes().toString() ==> " + baseDeDatos.getTabPacientes().toString() );
        baseDeDatos.getTabPacientes().insertaPaciente(auxPaciente);
        return null;
    }

    public MiDummyDatabaseMB getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(MiDummyDatabaseMB baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }
}
