/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Libreria {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libro> listaLibros;

    public Libreria() {
        listaLibros = new HashSet();
    }

    public Libreria(HashSet<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public HashSet<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(HashSet<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    public void cargarLibro(){
        Libro l = new Libro();
        System.out.println("Información del libro:");
        System.out.println("Titulo:");
        l.setTitulo(leer.next());
        System.out.println("Autor");
        l.setAutor(leer.next());
        System.out.println("Cantidad de ejemplares");
        l.setCantEjemplares(leer.nextInt());
        l.setNumEjemPrestados(0);
        listaLibros.add(l);
    }
    
    public boolean prestamo(String nombre){
        boolean prestamo = false;
        Libro libroEncontrado = buscarPorNombre(nombre);
        
        if (libroEncontrado != null) {
            if (libroEncontrado.getCantEjemplares() > libroEncontrado.getNumEjemPrestados()) {
                if (libroEncontrado.prestamo()) {
                    prestamo = true;
                    int disponible = libroEncontrado.getCantEjemplares() - libroEncontrado.getNumEjemPrestados();
                    System.out.println("Ejemplares disponibles: " + disponible );
                    System.out.println("Prestados: " + libroEncontrado.getNumEjemPrestados());
                }else
                    System.out.println("No hay ejemplares de " + nombre + " disponibles para prestar");
            }else
                System.out.println("No hay ejemplares de " + nombre + " disponibles para prestar");
        }else
            System.out.println(nombre + " no se encuentra en la lista de libros");
        
        return prestamo;
    }
    
    public boolean devolucion(String nombre){
        boolean devolucion = false;
        
        Libro libroEncontrado = buscarPorNombre(nombre);
     
        if (libroEncontrado != null) {
            if (libroEncontrado.getNumEjemPrestados() > 0) {
                if (libroEncontrado.devolucion()) {
                    devolucion = true;
                    int disponible = libroEncontrado.getCantEjemplares() - libroEncontrado.getNumEjemPrestados();
                    System.out.println("Ejemplares disponibles: " + disponible );
                    System.out.println("Prestados: " + libroEncontrado.getNumEjemPrestados());
                } else
                    System.out.println("No hay ejemplares prestados de " + nombre);
            } else
                System.out.println("No hay ejemplares prestados de " + nombre);
        } else
            System.out.println(nombre + " no se encuentra en la lista de libros");

        return devolucion;
    }
    
    
    public Libro buscarPorNombre(String nombre){
        Iterator<Libro> iterator = listaLibros.iterator();
        System.out.println("Buscando " +nombre);
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getTitulo().toLowerCase().equals(nombre.toLowerCase())) {
                return libro;
            }
        }
        return null;
    }
    
    public void listaToString(HashSet listaLibros){
        System.out.println("-----");
        listaLibros.forEach((libro) -> {
            System.out.println(libro.toString());
        });
        System.out.println("-----");
    }
}
