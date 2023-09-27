/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

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
public class ElectrodomesticoTest {
    Electrodomestico instance;
    public ElectrodomesticoTest() {
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
     * Test of precioFinal method, of class Electrodomestico.
     */
    @Test
    public void testPrecioFinal() {
        System.out.println("Precio final");
        instance  = new Electrodomestico(80, "blanco", 'a');
        Double expResult = 3000d;
        Double result = instance.precioFinal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComprobarColor(){
        System.out.println("Comprobacion de color");
        instance = new Electrodomestico(60,"gris",'b');
        String expResult = "gris";
        String result = instance.comprobarColor(instance.getColor());
        assertEquals(expResult, result);
    }

    @Test
    public void testComprobarConsumoEnergetico(){
        System.out.println("Comprobacion de consumo energetico");
        instance = new Electrodomestico(50, "negro", 'a');
        Character expResult = 'a';
        Character result = instance.comprobarConsumoEnergetico(instance.getConsumoEnergetico());
        assertEquals(expResult, result);
    }
}
