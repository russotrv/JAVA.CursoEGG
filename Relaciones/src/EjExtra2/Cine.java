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
public class Cine {
    private String peliculaEnRep, sala;
    private Double precioEntrada;

    public Cine() {
    }

    public String getPeliculaEnRep() {
        return peliculaEnRep;
    }

    public void setPeliculaEnRep(String peliculaEnRep) {
        this.peliculaEnRep = peliculaEnRep;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{\n" + "Pelicula en reproduccion: " + peliculaEnRep + "\nSala: " + sala + "\nPrecio de la entrada: " + precioEntrada + "\n}";
    }
    
    
}
