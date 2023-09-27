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
public class DiscountCalculatorTest {
    DiscountCalculator instance;
    
    public DiscountCalculatorTest() {
        instance = new DiscountCalculator();
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

    /*
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    @Test
    public void testDescuento() {
        assertEquals(10, instance.descuento(0.1, 100), 0);
        assertEquals(50, instance.descuento(0.5, 100), 0);
        assertEquals(0, instance.descuento(0, 100), 0);
        assertEquals(100, instance.descuento(1, 100), 0);
        
    }
    /*
    @Test
    public void testDiscount() {
        System.out.println("Discount");
        double cantidad = 100;
        double percent = 0.1;
        DiscountCalculator instance = new DiscountCalculator();
        double expResult = 10.0;
        double result = instance.descuento(cantidad, percent);
        assertEquals(expResult, result, 0);
    }
    */
}
