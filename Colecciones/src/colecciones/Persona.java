/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Juan
 */
public class Persona {
    private String nombre, pais;
    private Integer edad, dni;

    public Persona() {
    }

    public Persona(String nombre, String pais, Integer edad, Integer dni) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "\n{" + "\nNombre: " + nombre + "\nEdad: " + edad + "\nDni: " + dni + "\nPais: " + pais +"}\n";
    }
    
    
    
}
