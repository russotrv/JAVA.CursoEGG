/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Juan
 */
public class Baraja {
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> cartasRepartidas;

    public Baraja() {
        baraja = new ArrayList();
        cartasRepartidas = new ArrayList();
    }
/*
    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
*/
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
    public void llenarBaraja(){
        String[] palos = {"Basto", "Espada", "Copa", "Oro"};
        Carta c;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                c = new Carta();
                if(j >= 8) {
                    c.setNumero(j+2);
                }else
                    c.setNumero(j);
                c.setPalo(palos[i]);
                baraja.add(c);
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
    
    private Carta siguienteCarta(int posicion){
        cartasRepartidas.add(baraja.get(posicion));
        return baraja.get(posicion);
    }

    public int cartasDisponibles(int posicion){
        int cantidad = (baraja.size() - posicion);
        System.out.println("Cartas disponibles: " + cantidad);
        return cantidad;
    }
    
    public ArrayList<Carta> darCartas(int cant, int posicion){
        ArrayList<Carta> mano = new ArrayList();
        
        if(cartasDisponibles(posicion) >= cant){
            for (int i = 0; i < cant; i++) {
                mano.add(siguienteCarta(posicion+i));
            }
        }else
            System.out.println("No quedan suficientes cartas disponibles");
        return mano;
    }
    
    public void cartasMonton(){
        System.out.println("Cartas repartidas:");
        if(cartasRepartidas == null){
            System.out.println("Aun no se repartieron cartas");
        }else
            System.out.println(cartasRepartidas.toString());
    }
    
    public void mostrarBaraja(int posicion){
        System.out.println("*Cartas disponibles:");
        for (int i = posicion; i < baraja.size(); i++) {
            System.out.println(baraja.get(i));
        }
    }
    
}
