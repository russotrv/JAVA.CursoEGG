/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;


/**
 *
 * @author Juan
 */
public class NumeroAleatorio {
    protected int aleatorio = (int)(Math.random()*501); 

    public NumeroAleatorio() {
    }

    public int getAleatorio() throws ArithmeticException {
        return aleatorio;
    }
    
    
}
