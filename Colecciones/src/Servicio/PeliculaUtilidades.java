/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Juan
 */
public class PeliculaUtilidades {
    
    public static Comparator<Pelicula> ordenarDurDesc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarDurAsc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t1.getDuracion().compareTo(t2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t1.getTitulo().compareTo(t2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
           return t1.getDirector().compareTo(t2.getDirector());
        }
    };
    
}
