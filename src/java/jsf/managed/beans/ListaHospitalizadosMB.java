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
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rob.desarrollo.auxiliares.MiDummyDatabaseMB;
import rob.desarrollo.entidades.DummyEntidadPaciente;
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

//    private String historiaClinica;
//    private List<Paciente> listaHospitalizados;
//    private Map<String, Paciente> mapaHospitalizados;
//    private Paciente hospitalizadoSeleccionado;
    
    private List<DummyEntidadPaciente> misPacientes;
    private List<DummyEntidadPaciente> misPacientesFiltrados;
    private DummyEntidadPaciente pacienteSeleccionado;
    private String historiaClinica;
    
    @Inject
    private MiSesionMB miSesionMB;
    @Inject
    private MiDummyDatabaseMB miDummyDatabaseMB;

    /**
     * Creates a new instance of ListaHospitalizadosMB
     */
    public ListaHospitalizadosMB() {
    }

    @PostConstruct
    private void inicializar() {
        setMisPacientes( miDummyDatabaseMB.getTabPacientes().getRecuperarPacientes() );
    }
    
    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
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

    public DummyEntidadPaciente getPacienteSeleccionado() {
        return pacienteSeleccionado;
    }

    public void setPacienteSeleccionado(DummyEntidadPaciente pacienteSeleccionado) {
        this.pacienteSeleccionado = pacienteSeleccionado;
    }

//    public List<Paciente> getListaHospitalizados() {
//        return listaHospitalizados;
//    }
//
//    public void setListaHospitalizados(List<Paciente> listaHospitalizados) {
//        this.listaHospitalizados = listaHospitalizados;
//    }
//
//    public Map<String, Paciente> getMapaHospitalizados() {
//        return mapaHospitalizados;
//    }
//
//    public void setMapaHospitalizados(Map<String, Paciente> mapaHospitalizados) {
//        this.mapaHospitalizados = mapaHospitalizados;
//    }
//
//    public Paciente getHospitalizadoSeleccionado() {
//        return hospitalizadoSeleccionado;
//    }
//
//    public void setHospitalizadoSeleccionado(Paciente hospitalizadoSeleccionado) {
//        this.hospitalizadoSeleccionado = hospitalizadoSeleccionado;
//    }

//    public void cargarTabla() {
////        Logback 
//        _log.trace("Carga de la lista de pacientes hospitalizados desde la BBDD");
//
//        
//
//        listaHospitalizados = new ArrayList<>();
//        listaHospitalizados.add(new Paciente("HPTL00001", "Rachel Green", "Cama 101"));
//        listaHospitalizados.add(new Paciente("HPTL00002", "Chandler Bing", "Cama 102"));
//        listaHospitalizados.add(new Paciente("HPTL00003", "Monica Geller", "Cama 103"));
//        listaHospitalizados.add(new Paciente("HPTL00004", "Joey Tribbiani", "Cama 216"));
//        listaHospitalizados.add(new Paciente("HPTL00005", "Phoebe Buffay", "Cama 105"));
//        listaHospitalizados.add(new Paciente("HPTL00006", "Ross Geller", "Box 2"));
//
//        // --- FULLA --- 
//        // --- FULLA --- Creo un Map para emular el acceso a BBDD
//        // --- FULLA --- 
//        mapaHospitalizados = new HashMap<String, Paciente >();
//        for (Paciente p : listaHospitalizados) {
//            mapaHospitalizados.put( p.getCodPaciente(), p);
//        }
//    }

    public void onRowSelect(SelectEvent pEventoSeleccion) {
        setHistoriaClinica(((DummyEntidadPaciente) pEventoSeleccion.getObject()).getDummyHistorial());
    } 

    /**
     * 
     * @return 
     */
    public String navegar() {
        String miOutcome = "apuntes";
        
        // Guarda en un Managed Bean de ámbito sesión el paciente escogido
        miSesionMB.setDummyEntidadPaciente( miDummyDatabaseMB
                                            .getTabPacientes()
                                            .getRecuperaPacientePorHistoria(historiaClinica) );
        
        return miOutcome;
    }

//    /**
//     * No se emplea Dependency Injection, sino la forma larga porque ésta no
//     * falla y la otra depende de la implementación empleada
//     */
//    private Map<String, Object> getMiSessionMap() {
//        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
//    }

    
}
