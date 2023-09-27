/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class LibroServicio {
 
    public Libro altaLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //creacion de objeto vacio
        Libro libro = new Libro();
        
        //cargar datos desde teclado
        System.out.println("Ingrese titulo del libro:");
        libro.setTitulo(leer.next());
        
        System.out.println("Ingrese autor/a del libro:");
        libro.setAutor(leer.next());
        
        System.out.println("Ingrese ISBN del libro:");
        libro.setISBN(leer.nextInt());
        
        System.out.println("Ingrese cantidad de paginas de libro:");
        libro.setNroPaginas(leer.nextInt());
        
        return libro;
    }
    
    public void mostrarLibro(Libro libro){
        System.out.println(libro.toString());
    }
}
