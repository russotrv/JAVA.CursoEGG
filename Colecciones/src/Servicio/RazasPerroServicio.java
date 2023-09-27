/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.RazasPerro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class RazasPerroServicio {
    ArrayList<RazasPerro> listaRazas;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public RazasPerroServicio() {
        listaRazas = new ArrayList();
    }
    
    public void agregarRaza(){
        RazasPerro raza = new RazasPerro();
        System.out.println("Nombre de la raza:");
        raza.setRaza(leer.next());
        listaRazas.add(raza);
    }
    
    public void mostrarLista(){
        System.out.println(listaRazas.toString());
    }
    
    public int menu(){
        System.out.println("Elija una opcion:");
        System.out.println("1. Agregar raza de perro a la lista");
        System.out.println("2. Salir y ver lista");
        int res = leer.nextInt();
        return res;
    }
    
    public void iterar(String razaEliminar) {
        Iterator<RazasPerro> it = listaRazas.iterator();
        
        while (it.hasNext()) {
            if (it.next().toString().equals(razaEliminar)) {
                it.remove();
            }
        }
        mostrarLista();
    }
}
