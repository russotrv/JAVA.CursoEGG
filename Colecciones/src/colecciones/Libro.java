/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Objects;

public class Libro {
    //título del libro, autor, número de ejemplares y número de ejemplares prestados
    private String titulo, autor;
    private int cantEjemplares, numEjemPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int cantEjemplares, int numEjemPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantEjemplares = cantEjemplares;
        this.numEjemPrestados = numEjemPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public int getNumEjemPrestados() {
        return numEjemPrestados;
    }

    public void setNumEjemPrestados(int numEjemPrestados) {
        this.numEjemPrestados = numEjemPrestados;
    }

    public boolean prestamo(){
        boolean prestamo = false;
        if(numEjemPrestados + 1 <= this.cantEjemplares){
                numEjemPrestados ++;
                prestamo = true;
        }
        return prestamo;
    }
    
    public boolean devolucion(){
        boolean devolucion = false;
        if(numEjemPrestados > 0){
            numEjemPrestados --;
            devolucion = true;
        }
        return devolucion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.autor);
        hash = 29 * hash + this.cantEjemplares;
        hash = 29 * hash + this.numEjemPrestados;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.cantEjemplares != other.cantEjemplares) {
            return false;
        }
        if (this.numEjemPrestados != other.numEjemPrestados) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nCantidad de ejemplares: " + cantEjemplares + "\nNumero de ejemplares prestados: " + numEjemPrestados+ "\n";
    }
    
    
}
