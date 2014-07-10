/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managed.beans;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.NavigationHandler;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import value.objects.User;

/**
 *
 * @author Roberto
 */
@Named(value = "loginMB")
// Tiene que ser @ViewScoped, si la dejo @RequestScoped, la carga de los usuarios 
// en el pre-render view event se pierde y me deja colgado en la validación con 
// un NullPointerException
@ViewScoped
public class LoginMB {

    private String usuario;
    private String password;
    private Map<String, User> mapaUsuarios;

    @Inject
    private MiSesionMB sesionMB;

    @ManagedProperty(value = "#{facesContext}")
    private FacesContext contextoFaces;

    /**
     * Creates a new instance of LoginMB
     */
    public LoginMB() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String validarLogin() {
        String outcome = null;

        User auxUsuario = mapaUsuarios.get(this.getUsuario());
        if (auxUsuario != null & auxUsuario.getPassword().equals(this.getPassword())) {
            sesionMB.setUsuario(auxUsuario);
            sesionMB.setUserLoggedIn(true);
            outcome = "inicio";
        }

        return outcome;
    }

    /**
     * Procesos previos a la renderización de la vista .xhtml Permite una
     * renavegación antes de la renderización si el usuario ya estuviese dado de
     * alta: obvia la pantalla de login y encamina directamente a la pantalla de
     * inicio de la aplicación
     *
     * @param cse
     */
    public void preCargarPagina() {
        // Dirección (url) de la vista que ha invocado a este MBean
//        String idVistaJSF = contextoFaces.getViewRoot().getViewId();
        try {
            if (sesionMB.isUserLoggedIn() == true) {
                FacesContext facesContext = FacesContext.getCurrentInstance();
                NavigationHandler navigationHandler = facesContext.getApplication().getNavigationHandler();
                navigationHandler.handleNavigation(facesContext, null, "/inicio");
            }
//                ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
//                ec.redirect("/inicio?faces-redirect=true");
//            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        this.cargarUsuarios();
    }

    /**
     * Este método es de conveniencia. --- --- Debe cargar los VO Usuarios antes
     * de la renderización de la vista. Los datos introducidos en el login se
     * validarán contra los VO Usuarios aquí cargados.
     */
    public void cargarUsuarios() {
        mapaUsuarios = new HashMap<>();
        mapaUsuarios.put("doctor1", new User("doctor1", "doctor"));
        mapaUsuarios.put("doctor2", new User("doctor2", "doctor"));
        mapaUsuarios.put("fisio1", new User("fisio1", "fisio"));
        mapaUsuarios.put("fisio2", new User("fisio2", "fisio"));
    }

}
