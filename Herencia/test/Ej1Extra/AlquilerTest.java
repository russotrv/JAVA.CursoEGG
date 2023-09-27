/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1Extra;

import java.util.Date;
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
public class AlquilerTest {
    static Alquiler a;
    static Barco b;
    
    public AlquilerTest() {
        
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

    @Test
    public void testPrecio() {
        //b = new Barco("AAA1111", 100, new Date(2011,2,11));
        //a = new Alquiler("Juani", 1111111, 1, new Date(2023,8,25), new Date(2023,9,7), b);
        Double precioEsperado = 12d * 10d * 100d;
        a.precio();
       // assertEquals(precioEsperado, a.getPrecio());
    }
    
}
