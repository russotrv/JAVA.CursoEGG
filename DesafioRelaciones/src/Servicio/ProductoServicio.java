/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Producto;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ProductoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Producto crearProducto(){
        Producto p = new Producto();
        System.out.println("Informacion del producto:");
        
        System.out.println("ID: ");
        p.setId(leer.nextInt());
        System.out.println("Nombre: ");
        p.setNombre(leer.next());
        System.out.println("Precio: ");
        p.setPrecio(leer.nextDouble());
        System.out.println("Stock disponible:");
        p.setCantidad(leer.nextInt());
        
        return p;
    }
    
    public void mostrarProducto(Producto p){
        System.out.println(p.toString());
    }
    
        
}
