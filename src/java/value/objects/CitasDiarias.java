/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package value.objects;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Roberto
 */
public class CitasDiarias {

    private List<CitaAmbulante> listaCitas;
    private Date fecha;
    private boolean slotsCompletos;

    public CitasDiarias() {
    }

    public CitasDiarias(List<CitaAmbulante> listaCitas, Date fecha, boolean slotsCompletos) {
        this.listaCitas = listaCitas;
        this.fecha = fecha;
        this.slotsCompletos = slotsCompletos;
    }

    public List<CitaAmbulante> getListaCitas() {
        return listaCitas;
    }

    public void setListaCitas(List<CitaAmbulante> listaCitas) {
        this.listaCitas = listaCitas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isSlotsCompletos() {
        return slotsCompletos;
    }

    public void setSlotsCompletos(boolean slotsCompletos) {
        this.slotsCompletos = slotsCompletos;
    }

    
}
