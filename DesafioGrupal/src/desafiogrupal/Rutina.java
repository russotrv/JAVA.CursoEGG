/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogrupal;

/**
 *
 * @author Juan
 */
public class Rutina {
    private int id, duracion;
    private String nombre, nivelDificultad, descripcion;

    public Rutina() {
    }

    public Rutina(int id, int duracion, String nombre, String nivelDificultad, String descripcion) {
        this.id = id;
        this.duracion = duracion;
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nNombre: " + nombre +"\nDuracion:" + duracion +"\nNivel de dificultad: " + nivelDificultad + ",\nDescripcion: " + descripcion;
    }
    
    
}
