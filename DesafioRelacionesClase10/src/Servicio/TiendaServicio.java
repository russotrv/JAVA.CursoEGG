/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Producto;
import Entidades.Tienda;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class TiendaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Tienda> listaTiendas;
    private ProductoServicio ps = new ProductoServicio();

    public TiendaServicio() {
        listaTiendas = new ArrayList();
    }
    
    public void crearTienda(){
        Tienda t = new Tienda();
        System.out.println("Informacion de la tienda:");
        t.setIdTienda();
        System.out.println("Direccion:");
        t.setDireccion(leer.next());
        System.out.println("Representante: ");
        t.setRepresentante(leer.next());
        t.setListaProductos(ps.getListaProductos());
        
        listaTiendas.add(t);
    }
    
    public void inicializarTienda(){
        Tienda t1,t2,t3;
        ps.inicializar();
        t1 = new Tienda(ps.getListaProductos(),"Araoz 232","Roberto Gonzalez");
        t2 = new Tienda(ps.getListaProductos(),"Cochabamba 2000", "Paula Lopez");
        t3 = new Tienda(ps.getListaProductos(), "Saenz Peña 890", "Erica Gomez");
        listaTiendas.add(t1);
        listaTiendas.add(t2);
        listaTiendas.add(t3);
    }
    
    public void mostrarTienda(){
        System.out.println("Productos en las tiendas:");
        listaTiendas.forEach((tienda) -> {
            System.out.println(tienda.toString());
            System.out.println("-----");
        });
    }
    
    public void modificarTienda(){
        Tienda t = buscarTienda();
        System.out.println("Nuevos datos de la tienda:");
        System.out.println("Direccion:");
        t.setDireccion(leer.next());
        System.out.println("Representante:");
        t.setRepresentante(leer.next());
        System.out.println("Modificar lista de productos..");
    }
    
    public void eliminarTienda(){
        Tienda t = buscarTienda();
        listaTiendas.remove(t);
    }
    
    private Tienda buscarTienda(){
        Tienda t = new Tienda();
        Integer idTienda;
        boolean esta = false;
        
        do{
            System.out.println("Ingrese ID de la tienda:");
            idTienda = leer.nextInt();
            for (Tienda tienda : listaTiendas) {
                if(tienda.getIdTienda().equals(idTienda)){
                    t = tienda;
                    esta = true;
                }
            }
        }while(esta == false);
        
        return t;
    }
    
    public void agregarProducto(){
        ArrayList<Producto> listaProductos1;
        Tienda t = buscarTienda();
        listaProductos1 = new ArrayList(t.getListaProductos());
        //ps.crearProducto();
        Producto p = new Producto("Auriculares", 30000.0, 8);
        listaProductos1.add(p);
        t.setListaProductos(listaProductos1);
    }
    
    public void venderProducto(Integer cantidad){
        Tienda t = buscarTienda();
        Producto p = ps.buscarProducto(t.getListaProductos());
        
        if( p.getInventario() - cantidad >= 0){
            System.out.println("Venta realizada!");
            p.setInventario(p.getInventario() - cantidad);
        }else
            System.out.println("No hay inventario suficiente");
    }
    
    public void eliminarProducto(){
        Tienda t = buscarTienda();
        Producto p = ps.buscarProducto(t.getListaProductos());
        
        t.getListaProductos().remove(p);
    }
    
    public void stockProductos(){
        int cantP = 0;
        for (Tienda tienda : listaTiendas) {
            cantP += tienda.getListaProductos().size();
        }
        System.out.println("Cantidad de productos entre las " + listaTiendas.size() + " tiendas: " + cantP);
    }
    
}
