/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsf.managed.beans;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.event.SelectEvent;
import value.objects.Paciente;

/**
 *
 * @author Roberto
 */
public class ListaHospitalizadosMBTest {
    
    public ListaHospitalizadosMBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHistoriaClinica method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testGetHistoriaClinica() {
        System.out.println("getHistoriaClinica");
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        String expResult = "";
        String result = instance.getHistoriaClinica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHistoriaClinica method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testSetHistoriaClinica() {
        System.out.println("setHistoriaClinica");
        String historiaClinica = "";
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        instance.setHistoriaClinica(historiaClinica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaHospitalizados method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testGetListaHospitalizados() {
        System.out.println("getListaHospitalizados");
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        List<Paciente> expResult = null;
        List<Paciente> result = instance.getListaHospitalizados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaHospitalizados method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testSetListaHospitalizados() {
        System.out.println("setListaHospitalizados");
        List<Paciente> listaHospitalizados = null;
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        instance.setListaHospitalizados(listaHospitalizados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHospitalizadoSeleccionado method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testGetHospitalizadoSeleccionado() {
        System.out.println("getHospitalizadoSeleccionado");
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        Paciente expResult = null;
        Paciente result = instance.getHospitalizadoSeleccionado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHospitalizadoSeleccionado method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testSetHospitalizadoSeleccionado() {
        System.out.println("setHospitalizadoSeleccionado");
        Paciente hospitalizadoSeleccionado = null;
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        instance.setHospitalizadoSeleccionado(hospitalizadoSeleccionado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarTabla method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testCargarTabla() {
        System.out.println("cargarTabla");
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        instance.cargarTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onRowSelect method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testOnRowSelect() {
        System.out.println("onRowSelect");
        SelectEvent pEventoSeleccion = null;
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        instance.onRowSelect(pEventoSeleccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of navegar method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testNavegar() {
        System.out.println("navegar");
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        String expResult = "";
        String result = instance.navegar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
