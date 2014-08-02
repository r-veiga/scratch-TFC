/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsf.managed.beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import rob.desarrollo.entidades.DummyEntidadPaciente;
import value.objects.ListaFicherosSubidos;
import value.objects.Paciente;
import value.objects.User;

/**
 *
 * @author Roberto
 */
@Named(value = "miSesionMB")
@SessionScoped
public class MiSesionMB implements Serializable {

    private String lenguaje;
    private boolean userLoggedIn;
    private User usuario;
    private Paciente paciente;
    private DummyEntidadPaciente dummyEntidadPaciente;
    private ListaFicherosSubidos ultimosUploads;
    
    /**
     * Creates a new instance of miSesionMB
     */
    public MiSesionMB() {
    }

    @PostConstruct
    void inicializar(){
        lenguaje = "es";
    }
    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    public void setUserLoggedIn( boolean pUserLoggedIn ){
        this.userLoggedIn = pUserLoggedIn;
    }
    
    public boolean isUserLoggedIn() {
        return userLoggedIn;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public DummyEntidadPaciente getDummyEntidadPaciente() {
        return dummyEntidadPaciente;
    }

    public void setDummyEntidadPaciente(DummyEntidadPaciente dummyEntidadPaciente) {
        this.dummyEntidadPaciente = dummyEntidadPaciente;
    }

    public ListaFicherosSubidos getUltimosUploads() {
        return ultimosUploads;
    }

    public void setUltimosUploads(ListaFicherosSubidos ultimosUploads) {
        this.ultimosUploads = ultimosUploads;
    }
    
    public String logoff(){
        this.setPaciente(null);
        this.setDummyEntidadPaciente(null);
        this.setUsuario(null);
        this.setUserLoggedIn(false);
        this.setUltimosUploads(null);
        return "login";
    }
        
}
