/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsf.managed.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import rob.desarrollo.auxiliares.DummyTablaPacientes;
import rob.desarrollo.auxiliares.MiDummyDatabaseMB;
import rob.desarrollo.entidades.DummyEntidadPaciente;

/**
 *
 * @author Roberto
 */
@Named(value = "testMB")
@RequestScoped
public class TestMB {

    private List<DummyEntidadPaciente> misPacientes;
    private List<DummyEntidadPaciente> misPacientesFiltrados;
    
    @Inject
    private MiDummyDatabaseMB miDummyDatabaseMB;
    
    /**
     * Creates a new instance of TestMB
     */
    public TestMB() {
    }

    @PostConstruct
    public void inicializar(){
        setMisPacientes( miDummyDatabaseMB.getTabPacientes().getRecuperarPacientes() );
    }

    public List<DummyEntidadPaciente> getMisPacientes() {
        return misPacientes;
    }

    public void setMisPacientes(List<DummyEntidadPaciente> misPacientes) {
        this.misPacientes = misPacientes;
    }

    public List<DummyEntidadPaciente> getMisPacientesFiltrados() {
        return misPacientesFiltrados;
    }

    public void setMisPacientesFiltrados(List<DummyEntidadPaciente> misPacientesFiltrados) {
        this.misPacientesFiltrados = misPacientesFiltrados;
    }
    
    
    
}
