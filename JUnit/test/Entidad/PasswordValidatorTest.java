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
public class PasswordValidatorTest {
    PasswordValidator instance; 
    
    public PasswordValidatorTest() {
       instance = new PasswordValidator();
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
     * Test of longMinima method, of class PasswordValidator.
     */
    @Test
    public void testLongMinima() {
        System.out.println("longMinima");
        String contra = "contrasenia";
        boolean expResult = true;
        boolean result = instance.longMinima(contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Falle la longitud minima");
    }

    /**
     * Test of contieneCarEsp method, of class PasswordValidator.
     */
    @Test
    public void testContieneCarEsp() {
        System.out.println("contieneCarEsp");
        String contra = "contras";
        boolean expResult = false;
        boolean result = instance.contieneCarEsp(contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Fallaron los caracteres especiales");
    }

    /**
     * Test of contieneMayus method, of class PasswordValidator.
     */
    @Test
    public void testContieneMayus() {
        System.out.println("contieneMayus");
        String contra = "Contra";
        boolean expResult = true;
        boolean result = instance.contieneMayus(contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Fallaron las mayusculas");
    }
    
    @Test
    public void testEstructura(){
        assertFalse(instance.validadorEstructura("@Contrase"));
    }
}
