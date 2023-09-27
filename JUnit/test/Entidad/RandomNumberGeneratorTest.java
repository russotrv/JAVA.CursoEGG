/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Juan
 */
public class RandomNumberGeneratorTest {
    RandomNumberGenerator instance;
    
    public RandomNumberGeneratorTest() {
        instance = new RandomNumberGenerator();
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
        double random;
        boolean res;
        random = instance.numeroAleatorio();
        System.out.println("Primer numero: "+random);
        res = random>=0 & random<=10;
        assertEquals(true,res);
        random = instance.numeroAleatorio();
        System.out.println("Segundo numero: "+random);
        res = random>=0 & random<=10;
        assertEquals(true,res);
        random = instance.numeroAleatorio();
        System.out.println("Tercer numero: "+random);
        res = random>=0 & random<=10;
        assertEquals(true,res);
    }
    
}
