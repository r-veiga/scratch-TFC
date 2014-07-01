/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package value.objects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roberto
 */
public class ListaFicherosSubidos {
    
    private List<FicheroSubido> listaFichs;

    public List<FicheroSubido> getListaFichs() {
        return listaFichs;
    }

    public void setListaFichs(List<FicheroSubido> listaFichs) {
        this.listaFichs = listaFichs;
    }

    public void addUploadRef(String pClave, FicheroSubido pFichSubido) {        
        if( getListaFichs() == null ){
            setListaFichs( new ArrayList<FicheroSubido>() );
        }
        getListaFichs().add( pFichSubido );
    }
        
}
