/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Juan
 */
public class PalindromeChecker {
    
    public boolean chequeoPalindromo(String cadena){
        cadena = cadena.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(cadena);
        String inversa = sb.reverse().toString(); 
        return cadena.equals(inversa);
    } 
}
