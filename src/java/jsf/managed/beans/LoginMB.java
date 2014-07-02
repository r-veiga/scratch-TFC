/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managed.beans;

import java.util.HashMap;
import java.util.Map;
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

    public void cargarUsuarios() {
        mapaUsuarios = new HashMap<>();
        mapaUsuarios.put("doctor1", new User("doctor1", "doctor"));
        mapaUsuarios.put("doctor2", new User("doctor2", "doctor"));
        mapaUsuarios.put("fisio1", new User("fisio1", "fisio"));
        mapaUsuarios.put("fisio2", new User("fisio2", "fisio"));
    }

}
