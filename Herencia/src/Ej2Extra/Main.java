/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2Extra;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Main {
    public static void main(String[] args){
/*
El ArrayList debe contener dos polideportivos y dos edificios de oficinas. Luego,
recorrer este array y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. 
Se deberá mostrar la superficie y el volumen de cada edificio.

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/
        ArrayList<Edificio> listaEdificios = new ArrayList();
        Polideportivo poli1, poli2;
        EdificioDeOficinas edifOfic1, edifOfic2;
        
        poli1 = new Polideportivo("Poli del Lobo", "Techado", 50d, 18d, 39d);
        poli2 = new Polideportivo("Un Poli nuevo", "Abierto", 70d, 12d, 45d);
        edifOfic1 = new EdificioDeOficinas(15, 8, 10, 25d, 60d, 42d);
        edifOfic2 = new EdificioDeOficinas(8, 5, 6, 18d, 50d, 30d);
        
        listaEdificios.add(poli1);
        listaEdificios.add(poli2);
        listaEdificios.add(edifOfic1);
        listaEdificios.add(edifOfic2);
        //------
        int cantTechado = 0;
        int cantAbierto = 0;
        
        for (Edificio edificio : listaEdificios) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            System.out.println("-----");
            if(edificio.getClass() == Polideportivo.class){
               if(((Polideportivo) edificio).tipoDeInstalacion.equals("Abierto")){
                   cantAbierto += 1;
               }else
                   cantTechado += 1;
            }else if(edificio.getClass() == EdificioDeOficinas.class){
                ((EdificioDeOficinas)edificio).cantPersonas();
                System.out.println("-----");
                }        
        }
        System.out.println("Polideportivos: ");
        System.out.println("Techados: " + cantTechado);
        System.out.println("Abiertos: " + cantAbierto);
    }
}
