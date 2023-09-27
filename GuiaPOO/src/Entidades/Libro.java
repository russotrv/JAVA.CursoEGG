package Entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private Integer ISBN;
    private Integer nroPaginas;

    public Libro() {
    }

    public Libro(Integer ISBN, String titulo, String autor, Integer nroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.nroPaginas = nroPaginas;
    }
    
    
    
    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }
    
    public void setNroPaginas(Integer nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    
    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public Integer getNroPaginas() {
        return nroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", nroPaginas=" + nroPaginas + '}';
    }
    
    
    
    
}
