/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author Juan
 */
public class RandomNumberGenerator {
    
    public double numeroAleatorio(){
        Random random = new Random();
        int maxRango = 10;
        return random.nextDouble() * maxRango;
    }
    
}
