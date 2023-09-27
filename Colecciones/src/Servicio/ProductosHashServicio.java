/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ProductosHashServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> listaProductos = new HashMap<>();
    
    public void cargarProducto(){
        System.out.println("Cuantos productos va a cargar?");
        int cantP = leer.nextInt();
        for (int i = 0; i < cantP; i++) {
            System.out.println("Nombre del producto:");
            String nombre = leer.next();
            System.out.println("Precio:");
            Double precio = leer.nextDouble();
            listaProductos.put(nombre,precio);
        }
        System.out.println("Lista cargada");
    }
    
    public void modificar(String nombreP){
        System.out.println("Nuevo precio de " + nombreP);
        Double nuevoP = leer.nextDouble();
        listaProductos.put(nombreP,nuevoP);
    }
    
    public void eliminar(String nombreP){
       if(listaProductos.containsKey(nombreP)){
            listaProductos.remove(nombreP);
            System.out.println("Producto eliminado");
       }else
            System.out.println("El producto no se encuentra en la lista");
    }
    
    public void mostrar(){
        for (Map.Entry<String,Double> producto : listaProductos.entrySet()) {
            System.out.println("\nNombre: " + producto.getKey()
            + "\nPrecio: " + producto.getValue());
        }
    }
}