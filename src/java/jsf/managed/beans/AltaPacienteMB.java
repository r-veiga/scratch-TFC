/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.managed.beans;

import javax.inject.Named;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Roberto
 */
@Named(value = "altaPacienteMB")
@ViewScoped
public class AltaPacienteMB implements Serializable {

    private static final Logger _log = LoggerFactory.getLogger(AltaPacienteMB.class);

    /**
     * Constructor. Crea una nueva instancia de AltaPacienteMB
     */
    public AltaPacienteMB() {
    }

}
