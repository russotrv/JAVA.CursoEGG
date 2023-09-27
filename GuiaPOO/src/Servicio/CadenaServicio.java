/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        Cadena c = new Cadena();
        System.out.println("Ingrese una cadena de texto:");
        c.setCadena(leer.next());
        c.setLongitud(c.getCadena().length());
        return c;
    }
    
    public int mostrarVocales(Cadena c){        
        String frase = c.getCadena();
        int longitud = c.getLongitud();
        String vocales = "aeiou";
        String letra;
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
           letra = frase.substring(i, i+1);
           if(vocales.contains(letra)){
               cont++;
           }
        }
        return cont;
    }
    
    public void invertirFrase(Cadena c){
        
       String frase = c.getCadena();
       String reverso = new StringBuilder(frase).reverse().toString();
       System.out.println("Frase invertida: "+reverso); 
    }
    
    public void vecesRepetido(Cadena c, String letra){
        String frase = c.getCadena();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.substring(i,i+1).equals(letra))
                contador++;
        }
        System.out.println("El caracter "+letra+" se repite: "+contador+" veces en la frase");
    }
    
    public void compararLongitud(Cadena c, String frase){
        String cadena = c.getCadena();
        if (cadena.length() == frase.length()) {
            System.out.println("Las cadenas tienen la misma longitud");
        }else{
            if(cadena.length() > frase.length()){
                System.out.println("La cadena "+cadena+" es mayor que "+frase);
            }else
                System.out.println("La cadena "+frase+" es mayor que "+cadena);
        }
    }
    
    public void unirFrases(Cadena c, String frase){
        System.out.println("Cadenas concatenadas:");
        System.out.println(c.getCadena().concat(frase));
    }
    
    public void reemplazar(Cadena c, String letra){
        System.out.println("Cadena con letras a reemplazadas por " +letra+":");
        System.out.println(c.getCadena().replaceAll("a", letra));
    }
    
    public boolean contiene(Cadena c, String letra){
        return c.getCadena().contains(letra);
    }
}
