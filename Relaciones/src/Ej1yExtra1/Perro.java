/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1yExtra1;

/**
 *
 * @author Juan
 */
public class Perro {
    //nombre, raza, edad y tamaño;
    private String nombre, raza, tamanio;
    private int edad;
    boolean adopcion;
    
    public Perro() {
    }

    public Perro(String nombre, String raza, String tamanio, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
        this.adopcion = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAdopcion(boolean adopcion) {
        this.adopcion = adopcion;
    }

    
    public boolean getAdopcion() {
        return adopcion;
    }

    
    @Override
    public String toString() {
        return "{" + "\nNombre: " + nombre + "\nRaza: " + raza + "\nTamaño: " + tamanio + "\nEdad: " + edad + "\n}\n";
    }

    
    
}
