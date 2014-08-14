/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rob.desarrollo.auxiliares;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;

/**
 *
 * @author Roberto
 */
@Named(value = "miDummyDatabaseMB")
@SessionScoped
public class MiDummyDatabaseMB implements Serializable {

    private DummyTablaPacientes tabPacientes;
    private DummyTablaLocalizaciones tabLocalizaciones;
    /**
     * Creates a new instance of MiDummyDatabaseMB
     */
    public MiDummyDatabaseMB() {
    }
    
    @PostConstruct
    public void creaTablas() {
        tabPacientes = new DummyTablaPacientes();
        tabLocalizaciones = new DummyTablaLocalizaciones();
    }

    public DummyTablaPacientes getTabPacientes() {
        return tabPacientes;
    }

    public void setTabPacientes(DummyTablaPacientes tabPacientes) {
        this.tabPacientes = tabPacientes;
    }  

    public DummyTablaLocalizaciones getTabLocalizaciones() {
        return tabLocalizaciones;
    }

    public void setTabLocalizaciones(DummyTablaLocalizaciones tabLocalizaciones) {
        this.tabLocalizaciones = tabLocalizaciones;
    }
    
}
