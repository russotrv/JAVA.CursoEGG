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
public class DateValidatorTest {
    
    DateValidator instance;
    
    public DateValidatorTest() {
        instance = new DateValidator();
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
    public void testValidador() {
        assertEquals(true,instance.validarFecha("1/12/2004"));
        assertEquals(false,instance.validarFecha("33/12/2021"));
        assertEquals(false,instance.validarFecha("29/2/2018"));
        assertEquals(true,instance.validarFecha("26/11/1993"));
    }
    
}
