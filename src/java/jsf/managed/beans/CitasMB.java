/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managed.beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

/**
 * JSF Managed Bean @ViewScoped (ámbito vista). 
 * Este Managed Bean se emplea exclusivamente por la página /ambulantes/citas.xhtml
 * @author Roberto
 */
@Named(value = "citasMB")
@ViewScoped
public class CitasMB {

    private String textillo;
    private Date fechaSeleccionada = null;

    /**
     * Creates a new instance of CitasMB
     */
    public CitasMB() {
    }

    public Date getFechaSeleccionada() {
        return fechaSeleccionada;
    }

    public void setFechaSeleccionada(Date fechaSeleccionada) {
        this.fechaSeleccionada = fechaSeleccionada;
    }

    public String getTextillo() {
        if (fechaSeleccionada != null) {
            return textillo + fechaSeleccionada.toString() + " Roberto ";
        } else {
            return textillo + " Roberto ";
        }
    }

    public void setTextillo(String textillo) {
        this.textillo = textillo;
    }
    
    public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage( null,
                                 new FacesMessage( FacesMessage.SEVERITY_INFO,
                                                   "Día seleccionado",
                                                   format.format(event.getObject())
                                                  )
                                );
    }

    public void click() {
        RequestContext requestContext = RequestContext.getCurrentInstance();

        requestContext.update("form:display");
        requestContext.execute("PF('dlg').show()");
    }
}
