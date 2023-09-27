/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ProductoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Producto> listaProductos;

    public ProductoServicio() {
        listaProductos = new ArrayList();
    }  
    
    public Producto crearProducto(){
        Producto p = new Producto();
        System.out.println("Informacion del producto: ");
        p.setId();
        System.out.println("Nombre: ");
        p.setNombre(leer.next());
        System.out.println("Inventario: ");
        p.setInventario(leer.nextInt());
        System.out.println("Precio:");
        p.setPrecio(leer.nextDouble());
        listaProductos.add(p);
        return p;
    }
    
    public void inicializar(){
        Producto p1,p2,p3;
        p1 = new Producto("Teclado", 9999.99, 15);
        p2 = new Producto("Mouse", 5999.99, 10);
        p3 = new Producto("Monitor", 15999.99, 8);
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
    }
    
    public void mostrarProductos(){
        System.out.println("Lista de productos: ");
        listaProductos.forEach((producto) -> {
            System.out.println(producto.toString());
        });
    }
    
    public void modificarProducto(){
        Producto p = buscarProducto(listaProductos);
        System.out.println("Nuevo nombre:");
        p.setNombre(leer.next());
        System.out.println("Inventario:");
        p.setInventario(leer.nextInt());
        System.out.println("Precio:");
        p.setPrecio(leer.nextDouble());
    }
    
    public void eliminarProducto(){
        Producto p = buscarProducto(listaProductos);
        listaProductos.remove(p);
    }
    
    public Producto buscarProducto(ArrayList<Producto>listaP){
        Producto p = new Producto();
        Integer id;
        boolean estado = false;
        
        do{
            System.out.println("Ingrese id del producto a buscar: ");
            id = leer.nextInt();
            for (Producto producto : listaP) {
                if(producto.getId().equals(id)){
                    p = producto;
                    estado = true;
                }
            }
        }while(estado == false);
        
        return p;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
    
    
}
