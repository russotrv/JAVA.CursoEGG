/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej02;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Juan
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public Juego() {
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua revolver){
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }
    
    public void ronda(){
        boolean mojado = false;
        int i = 0;
        
        //Collections.shuffle(jugadores);
        
        while(mojado == false){
            System.out.println("Turno de " + jugadores.get(i).getNombre());
            System.out.println("---");
            System.out.println(revolver.toString());
            System.out.println("---");
            System.out.println("Disparando...");
            if(jugadores.get(i).disparar(revolver)){
                mojado = true;
                System.out.println("Fin del juego");
                System.out.println("Perdio "+ jugadores.get(i).getNombre());
            }else{
                System.out.println("Zafaste (por ahora...)");
                if((i+1) >= jugadores.size()){
                    i = 0;
                } else
                    i++;
            }
        }
    }
}
