/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managed.beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.view.ViewScoped;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import value.objects.ApunteMedico;
import value.objects.Paciente;

/**
 *
 * @author Roberto
 */
@Named(value = "apuntesMB")
@ViewScoped
public class ApuntesMB {

    private static final Logger _log = LoggerFactory.getLogger(ListaHospitalizadosMB.class);

    private List<ApunteMedico> listaApuntes;
    private Map<String, ApunteMedico> mapaApuntes;

    /**
     * Creates a new instance of ApuntesMB
     */
    public ApuntesMB() {
    }

    public List<ApunteMedico> getListaApuntes() {
        return listaApuntes;
    }

    public void setListaApuntes(List<ApunteMedico> listaApuntes) {
        this.listaApuntes = listaApuntes;
    }

    public Map<String, ApunteMedico> getMapaApuntes() {
        return mapaApuntes;
    }

    public void setMapaApuntes(Map<String, ApunteMedico> mapaApuntes) {
        this.mapaApuntes = mapaApuntes;
    }

    public void cargarTabla() {
//      Logback 
        _log.info("Carga de la lista de apuntes en el evento \"preRenderView\".");

        listaApuntes = new ArrayList<>();
        listaApuntes.add(new ApunteMedico("1", Calendar.getInstance().getTime(), "Dr. Trauma Uno", 1, "Este señor tiene un esguince de tobillo."));
        listaApuntes.add(new ApunteMedico("2", Calendar.getInstance().getTime(), "Dr. Trauma Uno", 2, "Esta señora se ha abierto la muñeca"));
        listaApuntes.add(new ApunteMedico("3", Calendar.getInstance().getTime(), "Dr. Otorrino Uno", 3, "Este señor tiene un tapón en el oído."));

        // --- FULLA --- 
        // --- FULLA --- Creo un Map para emular el acceso a BBDD
        // --- FULLA --- 
        mapaApuntes = new HashMap<>();
        for (ApunteMedico a : listaApuntes) {
            mapaApuntes.put(a.getIdApunte(), a);
        }
    }
}
