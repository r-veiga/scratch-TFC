/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rob.desarrollo.auxiliares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rob.desarrollo.entidades.DummyEntidadLocalizacion;

/**
 *
 * @author Roberto
 */
public class DummyTablaLocalizaciones {

    private Map<String, DummyEntidadLocalizacion> dummyLocalizaciones;
    public int numLocalizaciones;

    public DummyTablaLocalizaciones() {
        dummyLocalizaciones = new HashMap<String, DummyEntidadLocalizacion>();
        dummyLocalizaciones.put("Cama 101", new DummyEntidadLocalizacion("Cama 101", true, "HPTL00001"));
        dummyLocalizaciones.put("Cama 102", new DummyEntidadLocalizacion("Cama 102", true, "HPTL00002"));
        dummyLocalizaciones.put("Cama 103", new DummyEntidadLocalizacion("Cama 103", true, "HPTL00003"));
        dummyLocalizaciones.put("Cama 104", new DummyEntidadLocalizacion("Cama 104", false, null));
        dummyLocalizaciones.put("Cama 105", new DummyEntidadLocalizacion("Cama 105", false, "HPTL00005"));
        dummyLocalizaciones.put("Cama 106", new DummyEntidadLocalizacion("Cama 106", false, null));
        dummyLocalizaciones.put("Cama 201", new DummyEntidadLocalizacion("Cama 201", false, null));
        dummyLocalizaciones.put("Cama 202", new DummyEntidadLocalizacion("Cama 202", false, null));
        dummyLocalizaciones.put("Cama 203", new DummyEntidadLocalizacion("Cama 203", false, null));
        dummyLocalizaciones.put("Cama 204", new DummyEntidadLocalizacion("Cama 204", false, null));
        dummyLocalizaciones.put("Cama 205", new DummyEntidadLocalizacion("Cama 205", false, null));
        dummyLocalizaciones.put("Cama 206", new DummyEntidadLocalizacion("Cama 206", true, "HPTL00004"));
        dummyLocalizaciones.put("Box 1", new DummyEntidadLocalizacion("Box 1", false, null));
        dummyLocalizaciones.put("Box 2", new DummyEntidadLocalizacion("Box 2", true, "HPTL00006"));
        dummyLocalizaciones.put("Box 3", new DummyEntidadLocalizacion("Box 3", false, null));
        dummyLocalizaciones.put("Box 4", new DummyEntidadLocalizacion("Box 4", false, null));
        dummyLocalizaciones.put("Box 5", new DummyEntidadLocalizacion("Box 5", false, null));
        dummyLocalizaciones.put("Box 6", new DummyEntidadLocalizacion("Box 6", false, null));
        numLocalizaciones = dummyLocalizaciones.size();
    }

    public Map<String, DummyEntidadLocalizacion> getDummyLocalizaciones() {
        return dummyLocalizaciones;
    }

    public void setDummyLocalizaciones(Map<String, DummyEntidadLocalizacion> dummyLocalizaciones) {
        this.dummyLocalizaciones = dummyLocalizaciones;
    }

    public int getNumLocalizaciones() {
        return numLocalizaciones;
    }

    public void setNumLocalizaciones(int numLocalizaciones) {
        this.numLocalizaciones = numLocalizaciones;
    }

    public void insertaLocalizacion(DummyEntidadLocalizacion pLocalizacion) {

    }

    public List<String> getLocalizacionesLibres() {
        List<String> listaLocLibres = new ArrayList<String>();

        for (String loc : this.getDummyLocalizaciones().keySet()) {
            if (((DummyEntidadLocalizacion) this.getDummyLocalizaciones().get(loc)).isOcupado() == false) {
                listaLocLibres.add(loc);
            }
        }
        
        // Para ordenar naturalmente debo usar el método Collections.sort()
        // se alimenta de una sublist, así que debo crear una sublist del ArrayList que comprenda todos los ítems
        Collections.sort(listaLocLibres);
        return listaLocLibres;
    }
}
