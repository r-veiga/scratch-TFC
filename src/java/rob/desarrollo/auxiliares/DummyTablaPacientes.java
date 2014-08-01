/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rob.desarrollo.auxiliares;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rob.desarrollo.entidades.DummyEntidadPaciente;

/**
 * Clase que sólo existirá durante la fase de desarrollo. 
 * Finge ser la tabla USUARIOS de mi BBDD.
 * @author Roberto
 */
public class DummyTablaPacientes {
    
    private Map<String, DummyEntidadPaciente> dummyPacientes;
    public int numPacientes;
    
    public DummyTablaPacientes() {
        dummyPacientes = new HashMap<String, DummyEntidadPaciente>();
        dummyPacientes.put( "HPTL00001", new DummyEntidadPaciente("HPTL00001", "Rachel Green"  , "Cama 101", "12123123Ra", "tlfRa", "addrRa") );
        dummyPacientes.put( "HPTL00002", new DummyEntidadPaciente("HPTL00002", "Chandler Bing" , "Cama 102", "12123123Ch", "tlfCh", "addrCh") );
        dummyPacientes.put( "HPTL00003", new DummyEntidadPaciente("HPTL00003", "Monica Geller" , "Cama 103", "12123123Mo", "tlfMo", "addrMo") );
        dummyPacientes.put( "HPTL00004", new DummyEntidadPaciente("HPTL00004", "Joey Tribbiani", "Cama 216", "12123123Jo", "tlfJo", "addrJo") );
        dummyPacientes.put( "HPTL00005", new DummyEntidadPaciente("HPTL00005", "Phoebe Buffay" , "Cama 105", "12123123Ph", "tlfPh", "addrPh") );
        dummyPacientes.put( "HPTL00006", new DummyEntidadPaciente("HPTL00006", "Ross Geller"   , "Box 2"   , "12123123Ro", "tlfRo", "addrRo") );   
        numPacientes = dummyPacientes.size();
    }

    public Map<String, DummyEntidadPaciente> getDummyPacientes() {
        return dummyPacientes;
    }

    public void setDummyPacientes(Map<String, DummyEntidadPaciente> dummyPacientes) {
        this.dummyPacientes = dummyPacientes;
    }
    
    public void insertaPaciente (DummyEntidadPaciente pPaciente){
        // OJO, la clave incrementa +1 y se le asigna formato como String "0000x"
        numPacientes++;
        String clave = "HPTL" + String.format( "%05d", numPacientes  );
        pPaciente.setDummyHistorial(clave);
        dummyPacientes.put( clave, pPaciente);
    }
    
    public List<DummyEntidadPaciente> getRecuperarPacientes() {
        List<DummyEntidadPaciente> misPacientes;
        misPacientes = new ArrayList<>( dummyPacientes.values() );
        return misPacientes;
    }
}
