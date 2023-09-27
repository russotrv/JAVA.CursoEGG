/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class PeliculaServicio {
    
    private ArrayList<Pelicula> listaPeliculas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private void crearPelicula(){
        Pelicula p = new Pelicula();
        
        System.out.println("Ingrese datos de la pelicula:");
        System.out.println("Titulo:");
        p.setTitulo(leer.next());
        
        System.out.println("Director/a:");
        p.setDirector(leer.next());
        
        System.out.println("Duracion (en hs):");
        p.setDuracion(leer.nextDouble());
        
        listaPeliculas.add(p);
        System.out.println("Pelicula cargada a la lista de peliculas!");
    }
    
    public void mostrarLista(){
        System.out.println(listaPeliculas);
    }
    
    public ArrayList devolverLista(){
        return listaPeliculas;
    }
    
    public void cargarListaPeliculas(){
        
        String res ="" ;
        do{
            crearPelicula();
            System.out.println("Quiere ingresar otra pelicula a la lista(s/n)");
            res = leer.next();
        }while(!res.equals("n"));
        
        System.out.println("Lista de peliculas:");
        mostrarLista();
        System.out.println("-----");
        System.out.println("");
        System.out.println("Lista de peliculas con duración mayor a una hora:");
        ArrayList listaPelMas1 = listaPelMay1Hora();
        System.out.println(listaPelMas1);
        System.out.println("-----");
        System.out.println("");
        System.out.println("Lista de películas ordenadas segun duracion: ");
        System.out.println("De mayor a menor:");
        listaPeliculas.sort(PeliculaUtilidades.ordenarDurDesc);
        mostrarLista();
        System.out.println("");
        System.out.println("-----");
        System.out.println("De menor a mayor:");
        listaPeliculas.sort(PeliculaUtilidades.ordenarDurAsc);
        mostrarLista();
        System.out.println("");
        System.out.println("-----");
        System.out.println("Lista de películas ordenadas alfabeticamente");
        System.out.println("Según título");
        listaPeliculas.sort(PeliculaUtilidades.ordenarPorTitulo);
        mostrarLista();
        System.out.println("");
        System.out.println("-----");
        System.out.println("Según director");
        listaPeliculas.sort(PeliculaUtilidades.ordenarPorDirector);
        mostrarLista();
    }
    
    private ArrayList listaPelMay1Hora(){
        ArrayList<Pelicula> listaNueva = new ArrayList();
        for (Pelicula pelicula : listaPeliculas) {
            if(pelicula.getDuracion() > 1){
                listaNueva.add(pelicula);
            }
        }
        return listaNueva;
    }
    
    
}
