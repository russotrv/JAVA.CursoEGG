/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjExtra2;

/**
 *
 * @author Juan
 */
public class Pelicula {
    private String titulo, director;
    private Integer duracion, edadMinima;

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Pelicula{\n" + "Titulo: " + titulo + "\nDirector: " + director + "\nDuracion: " + duracion + "\nEdad minima: " + edadMinima + "\n}";
    }    
    
}
