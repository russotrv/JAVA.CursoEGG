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
public class TemperatureConverterTest {
    TemperatureConverter tc;
    
    public TemperatureConverterTest() {
        tc = new TemperatureConverter();
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
    public void testSomeMethod() {
    
      assertEquals(-12.22,tc.farToCelsius(10),0.15);
      assertEquals(50,tc.celToFar(10),0.1);
      assertEquals(260.93,tc.farToKel(10),0.1);
      assertEquals(-441.7,tc.kelToFar(10),0.1);
      assertEquals(283.15,tc.celToKel(10),0.1);
      assertEquals(-263.15,tc.kelToCel(10),0.1);
    }
    
}
