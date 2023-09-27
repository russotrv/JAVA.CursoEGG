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
public class PalindromeCheckerTest {
    
    PalindromeChecker instance;
    
    public PalindromeCheckerTest() {
        instance = new PalindromeChecker();
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
     * Test of chequeoPalindromo method, of class PalindromeChecker.
     */
    @Test
    public void testChequeoPalindromo() {
        System.out.println("chequeoPalindromo");
        
        assertEquals(true, instance.chequeoPalindromo("dabale arroz a la zorra el abad"));
        assertEquals(false, instance.chequeoPalindromo("romance"));
        assertEquals(true, instance.chequeoPalindromo("reconocer"));
        
    }
    
}
