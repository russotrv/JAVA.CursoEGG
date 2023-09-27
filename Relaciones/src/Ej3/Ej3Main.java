/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Ej3Main {
    public static void main (String[] args){
        Baraja b = new Baraja();
        ArrayList<Carta> mano = new ArrayList();
        //Carta c ;
        int posicion = 0;
        int cantCartas = 5;
        
        b.llenarBaraja();
        b.barajar();
        b.mostrarBaraja(posicion);
        System.out.println("-----");
        
        while (posicion < 40){
            mano = b.darCartas(cantCartas, posicion);
            System.out.println("Mano repartida: ");
            System.out.println(mano.toString());
            b.cartasMonton();
            //b.cartasDisponibles(posicion);
            mano = new ArrayList();
            posicion += cantCartas;
        }
    }
}
