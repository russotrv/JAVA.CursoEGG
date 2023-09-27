/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1yExtra1;

import Ej1yExtra1.Persona;
import Ej1yExtra1.Perro;

/**
 *
 * @author Juan
 */
public class Ej1Main {

    public static void main(String[] args) {
        
        RefugioPerro rp = new RefugioPerro();
        rp.llenarListaPerros();
        rp.llenarListaPersonas();
        rp.adoptar();
    }
    
}
