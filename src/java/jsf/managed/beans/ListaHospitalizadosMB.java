/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managed.beans;

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import value.objects.Paciente;

/**
 *
 * @author Roberto
 */
@Named(value = "listaHospitalizadosMB")
// @RequestScoped
@ViewScoped
public class ListaHospitalizadosMB {

//    static final Logger logger = LogManager.getLogger(ListaHospitalizadosMB.class);
    private static final Logger _log = LoggerFactory.getLogger(ListaHospitalizadosMB.class);

    private String historiaClinica;
    private List<Paciente> listaHospitalizados;
    private Paciente hospitalizadoSeleccionado;

    /**
     * Creates a new instance of ListaHospitalizadosMB
     */
    public ListaHospitalizadosMB() {
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public List<Paciente> getListaHospitalizados() {
        return listaHospitalizados;
    }

    public void setListaHospitalizados(List<Paciente> listaHospitalizados) {
        this.listaHospitalizados = listaHospitalizados;
    }

    public Paciente getHospitalizadoSeleccionado() {
        return hospitalizadoSeleccionado;
    }

    public void setHospitalizadoSeleccionado(Paciente hospitalizadoSeleccionado) {
        this.hospitalizadoSeleccionado = hospitalizadoSeleccionado;
    }

    public void cargarTabla() {
//        historiaClinica = ((Paciente) getMiSessionMap().get("sessionMapPaciente")).nombre;

//        logger.error("--------------Carga la lista de hospitalizados.---------------------");
        System.err.println("------------- Comprobación de consola ERR ---------------------");
        System.out.println("------------- Comprobación de consola OUT ---------------------");

//        Logback 
        _log.trace("Hello World!");
        _log.debug("How are you today?");
        _log.info("I am fine.");
        _log.warn("I love programming.");
        _log.error("I am programming.");

        listaHospitalizados = new ArrayList<>();
        listaHospitalizados.add(new Paciente("HPTL00001", "Rachel Green", "Cama 101"));
        listaHospitalizados.add(new Paciente("HPTL00002", "Chandler Bing", "Cama 102"));
        listaHospitalizados.add(new Paciente("HPTL00003", "Monica Geller", "Cama 103"));
        listaHospitalizados.add(new Paciente("HPTL00004", "Joey Tribbiani", "Cama 216"));
        listaHospitalizados.add(new Paciente("HPTL00005", "Phoebe Buffay", "Cama 105"));
        listaHospitalizados.add(new Paciente("HPTL00006", "Ross Geller", "Box 2"));

        Map mapaHospitalizados = new HashMap<String, ArrayList<Paciente> >();
        for (Paciente p : listaHospitalizados) {
            mapaHospitalizados.put( p.getCodPaciente(), p);
        }
    }

    public void onRowSelect(SelectEvent pEventoSeleccion) {
        setHistoriaClinica(((Paciente) pEventoSeleccion.getObject()).getCodPaciente());
    }

    public String navegar() {
        String miOutcome = "apuntes";
        // Para PRUEBAS voy a ir devolviendo siempre el paciente 2 (sin lógica de selección)
        getMiSessionMap().put("sessionMapPaciente", listaHospitalizados.get(2));

        return miOutcome;
    }

    /**
     * No se emplea Dependency Injection, sino la forma larga porque ésta no
     * falla y la otra depende de la implementación empleada
     */
    private Map<String, Object> getMiSessionMap() {
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
    }

}
