/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ej2Main {
    public static void main(String[] args){
        int cantJugadores;
        RevolverAgua r = new RevolverAgua();
        Scanner leer = new Scanner(System.in);
        Jugador j;
        ArrayList<Jugador> listaJugadores = new ArrayList();
        Juego juego = new Juego();
        
        
        r.llenarRevolver();
        
        System.out.println("Cantidad de jugadores(1-6)");
        cantJugadores = leer.nextInt();
        if(cantJugadores >=1 && cantJugadores < 6 ){
            for (int i = 0; i < cantJugadores; i++) {
                j = new Jugador();
                j.setId(i);
                j.setNombre(i);
                listaJugadores.add(j);
            }
        }else{
            for (int i = 0; i < 6; i++) {
                j = new Jugador();
                j.setId(i);
                j.setNombre(i);
                listaJugadores.add(j);
            }
        }
        juego.llenarJuego(listaJugadores, r);
        juego.ronda();
    }
}
