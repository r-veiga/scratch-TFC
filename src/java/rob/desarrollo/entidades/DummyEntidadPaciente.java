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
public class DummyEntidadPaciente {

    private String dummyHistorial;
    private String dummyNombre;
    private String dummyLocalizacion;
    private String dummyDNI;
    private String dummyTelefono;
    private String dummyDireccion;

    public DummyEntidadPaciente() {
    }

    public DummyEntidadPaciente(String dummyHistorial, String dummyNombre, String dummyLocalizacion, String dummyDNI, String dummyTelefono, String dummyDireccion) {
        this.dummyHistorial = dummyHistorial;
        this.dummyNombre = dummyNombre;
        this.dummyLocalizacion = dummyLocalizacion;
        this.dummyDNI = dummyDNI;
        this.dummyTelefono = dummyTelefono;
        this.dummyDireccion = dummyDireccion;
    }

    public String getDummyHistorial() {
        return dummyHistorial;
    }

    public void setDummyHistorial(String dummyHistorial) {
        this.dummyHistorial = dummyHistorial;
    }

    public String getDummyNombre() {
        return dummyNombre;
    }

    public void setDummyNombre(String dummyNombre) {
        this.dummyNombre = dummyNombre;
    }

    public String getDummyLocalizacion() {
        return dummyLocalizacion;
    }

    public void setDummyLocalizacion(String dummyLocalizacion) {
        this.dummyLocalizacion = dummyLocalizacion;
    }

    public String getDummyDNI() {
        return dummyDNI;
    }

    public void setDummyDNI(String dummyDNI) {
        this.dummyDNI = dummyDNI;
    }

    public String getDummyTelefono() {
        return dummyTelefono;
    }

    public void setDummyTelefono(String dummyTelefono) {
        this.dummyTelefono = dummyTelefono;
    }

    public String getDummyDireccion() {
        return dummyDireccion;
    }

    public void setDummyDireccion(String dummyDireccion) {
        this.dummyDireccion = dummyDireccion;
    }

}
