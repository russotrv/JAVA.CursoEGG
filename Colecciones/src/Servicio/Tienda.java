/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Tienda {
    private ArrayList<Producto>listaProd = new ArrayList();
    private ProductoServicio ps = new ProductoServicio();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    El usuario ingresa el nombre del producto que quiere comprar y se lo busca en el
    ArrayList. Si está en el ArrayList, se llama con ese objeto Producto al método. El método se
    decrementa de a uno, como un carrito de compras, el atributo cantidad en inventario, del producto que
    ingresó el usuario. Esto sucederá cada vez que se realice una venta del producto. No se podrán vender
    productos de los que no queden inventario disponible para vender. Devuelve true si se ha podido
    realizar la operación y false en caso contrario.
    */
    
    public ArrayList crearLista(int cantProd){
        System.out.println("Creando lista de productos de la tienda");

        for (int i = 0; i < cantProd; i++) {
            System.out.println("Ingrese informacion del producto [" + (i+1)+"]:");
            listaProd.add(ps.crearProducto());
        }
        System.out.println("Lista de productos de la tienda cargada con éxito!");
        return listaProd;
    }
    
    public boolean venta(String nombreP, ArrayList<Producto>listaProd){
        Producto p;
        boolean venta = false;
        p = ps.buscarProducto(nombreP, listaProd);
        
        if(p.getNombre().equals(nombreP)){
            System.out.println("Cuántas unidades vendió?");
            int cantVendida = leer.nextInt();
            if(p.getCantidad() - cantVendida > 0){
                p.setCantidad(p.getCantidad()- cantVendida);
                System.out.println("Producto vendido");
                System.out.println("Inventario actual " +nombreP+ " "+ p.getCantidad() + " unidades");
                venta = true;
            }else
                System.out.println("No hay suficiente inventario de " + nombreP + " - cantidad: " + p.getCantidad());
        }else
            System.out.println("El producto no se encuentra en la lista");
        
        return venta;
    }
    
    /*
    Método reposición(): El usuario ingresa el nombre del producto que quiere reponer y se lo busca en el
    ArrayList. Si está en el ArrayList, se llama con ese objeto al método. El método incrementa de a uno,
    como un carrito de compras, el atributo cantidad en inventario, del producto seleccionado por el
    usuario. Esto sucederá cada vez que se produzca una reposición de un producto.
    */
    public void reposicion(String nombreP, ArrayList<Producto>listaProd){
        Producto p;
        p = ps.buscarProducto(nombreP, listaProd);
        
        if(p.getNombre().equals(nombreP)){
            System.out.println("Cuántas unidades repondrá?");
            int cantUnid = leer.nextInt();
            p.setCantidad(p.getCantidad() + cantUnid);
            System.out.println("Reposicion realizada");
            System.out.println("Inventario actual: " + p.getCantidad());
        }else
            System.out.println("El producto" + nombreP + "no se encuentra en la lista");
    }
    
    public void modificacion(String nombreP, ArrayList<Producto>listaProd){
        ps.modificarProducto(nombreP, listaProd);
    }
    
    public void eliminacion(String nombreP, ArrayList<Producto>listaProd){
        Producto p;
        p = ps.buscarProducto(nombreP, listaProd);
        
        if(p.getNombre().equals(nombreP)){
            listaProd.remove(p);
            System.out.println(nombreP + " eliminado de la lista");
        }
    }
    
    public void mostrarLista(){
        listaProd.forEach((producto) -> {
            System.out.println(producto.toString());
        });
        System.out.println("");
    }
}
