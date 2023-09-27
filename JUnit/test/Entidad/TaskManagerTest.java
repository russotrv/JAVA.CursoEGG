/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan
 */
public class TaskManagerTest {
    private TaskManager instance; 
    public TaskManagerTest() {
        instance = new TaskManager(); 
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
     * Test of agregarTarea method, of class TaskManager.
     */
    @Test
    public void testAgregarTarea() {
        System.out.println("agregarTarea");
        String tarea = "Tarea 1";
        instance.agregarTarea(tarea);
        tarea = "Tarea 2";
        instance.agregarTarea(tarea);
        tarea = "Tarea 3";
        instance.agregarTarea(tarea);
    }

    /**
     * Test of mostrarTareas method, of class TaskManager.
     */

    /**
     * Test of eliminarTarea method, of class TaskManager.
     */
    @Test
    public void testEliminarTarea() {
        System.out.println("eliminarTarea");
        String tarea = "Tarea 3";
        instance.eliminarTarea(tarea);
    }

}
