/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej02;

/**
 *
 * @author Juan
 */
public class Jugador {
    private String nombre;
    private Integer id;
    private boolean mojado;

    public Jugador() {
        this.mojado = false;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        
    public void setNombre(Integer id) {
        this.nombre = "Jugador " + id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparar(RevolverAgua r){
        boolean mojar = false;
        
        if(r.mojar()){
            this.mojado = true;
            mojar = true;
        }
        
        r.siguienteChorro();
        
        return mojar;
    }

    @Override
    public String toString() {
        return "{\nNombre: " + nombre + "ID: " + id + "Mojado: " + mojado + '}';
    }
    
    
    
}
