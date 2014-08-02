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
import rob.desarrollo.entidades.DummyEntidadPaciente;

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
     * Test of getMisPacientes method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testGetMisPacientes() {
        System.out.println("getMisPacientes");
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        List<DummyEntidadPaciente> expResult = null;
        List<DummyEntidadPaciente> result = instance.getMisPacientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMisPacientes method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testSetMisPacientes() {
        System.out.println("setMisPacientes");
        List<DummyEntidadPaciente> misPacientes = null;
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        instance.setMisPacientes(misPacientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMisPacientesFiltrados method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testGetMisPacientesFiltrados() {
        System.out.println("getMisPacientesFiltrados");
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        List<DummyEntidadPaciente> expResult = null;
        List<DummyEntidadPaciente> result = instance.getMisPacientesFiltrados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMisPacientesFiltrados method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testSetMisPacientesFiltrados() {
        System.out.println("setMisPacientesFiltrados");
        List<DummyEntidadPaciente> misPacientesFiltrados = null;
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        instance.setMisPacientesFiltrados(misPacientesFiltrados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPacienteSeleccionado method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testGetPacienteSeleccionado() {
        System.out.println("getPacienteSeleccionado");
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        DummyEntidadPaciente expResult = null;
        DummyEntidadPaciente result = instance.getPacienteSeleccionado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPacienteSeleccionado method, of class ListaHospitalizadosMB.
     */
    @Test
    public void testSetPacienteSeleccionado() {
        System.out.println("setPacienteSeleccionado");
        DummyEntidadPaciente pacienteSeleccionado = null;
        ListaHospitalizadosMB instance = new ListaHospitalizadosMB();
        instance.setPacienteSeleccionado(pacienteSeleccionado);
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
