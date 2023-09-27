/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Juan
 */
public class Ahorcado {
    private String[] palabraBuscar;
    private int letrasEncontradas, jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int letrasEncontradas, int jugadasMax) {
        this.palabraBuscar = palabraBuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    
}
