/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ProductoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Producto crearProducto(){
        Producto p = new Producto();
       
        System.out.println("Nombre:");
        p.setNombre(leer.next());
        System.out.println("Categoria");
        p.setCategoria(leer.next());
        System.out.println("Cantidad:");
        p.setCantidad(leer.nextInt());
        System.out.println("Precio:");
        p.setPrecio(leer.nextDouble());
        
        return p;
    }
        
    public Producto buscarProducto(String nombre, ArrayList<Producto>listaProd){
        Producto p = new Producto();
        for (int i = 0; i < listaProd.size(); i++) {
            if(listaProd.get(i).getNombre().equals(nombre)){
                p = listaProd.get(i); 
            }
        }
        return p;
    }
    
    public void modificarProducto(String nombre, ArrayList<Producto>listaProd){
        int opc;
        Producto p;
        p = buscarProducto(nombre,listaProd);
        
        if(p.getNombre().equals(nombre)){
            System.out.println("Qué quieres modificar del producto:");
            System.out.println("1. Nombre");
            System.out.println("2. Categoría");
            System.out.println("3. Cantidad");
            System.out.println("4. Precio");
            opc = leer.nextInt();
            
            switch(opc){
                case 1: System.out.println("Ingrese nombre modificado:");
                        p.setNombre(leer.next());
                        break;
                case 2: System.out.println("Ingrese categoría modificada:");
                        p.setCategoria(leer.next());
                        break;
                case 3: System.out.println("Ingrese cantidad modificada:");
                        p.setCantidad(leer.nextInt());
                        break;
                case 4: System.out.println("Ingrese precio modificado:");
                        p.setPrecio(leer.nextDouble());
                        break;
                default: System.out.println("Opcion invalida");
                         break;
            }
        }else
            System.out.println("El producto no se encuentra en la lista");
    }
    
}
