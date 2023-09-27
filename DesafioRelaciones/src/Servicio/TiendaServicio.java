/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Producto;
import Entidades.Tienda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class TiendaServicio {
    private ArrayList<Producto> listaProductos;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Tienda> listaTiendas;

    public TiendaServicio() {
        listaProductos = new ArrayList();
        listaTiendas = new ArrayList();
    }
    
    public Tienda crearTiendaHardCode(Integer idTienda, ArrayList<Producto> listaProductos, String direccion, String representante){
        Tienda t = new Tienda(idTienda, listaProductos, direccion, representante);
        agregarProductos(listaProductos);
        listaTiendas.add(t);
        return t;
    }
    
    private void agregarProductos(ArrayList<Producto> listaProductos){
        listaProductos.forEach((producto) -> {
            listaProductos.add(producto);
        });
    }
    
    public Tienda crearTienda(){
        Tienda t = new Tienda();
        System.out.println("Informacion de la tienda: ");
        
        System.out.println("ID: ");
        t.setIdTienda(leer.nextInt());
        System.out.println("Direccion: ");
        t.setDireccion(leer.next());
        System.out.println("Representante: ");
        t.setRepresentante(leer.next());
        cargarProductos();
        t.setListaProductos(listaProductos);
        listaTiendas.add(t);
        
        return t;
    }
    
    private void cargarProductos(){
        ProductoServicio ps = new ProductoServicio();
        System.out.println("Cargar lista de productos de la tienda:");
        System.out.println("Cuantos productos va a cargar?");
        int cantP = leer.nextInt();
        for (int i = 0; i < cantP; i++) {
            listaProductos.add(ps.crearProducto());
        }
    }
    
    public void mostrarTienda(Tienda t){
        System.out.println(t.toString());
    }
    
    public void modificarTienda(Tienda t){
        System.out.println("Que desea modificar: ");
        System.out.println("1. Datos de la tienda.");
        System.out.println("2. Producto de la lista");
        int res = leer.nextInt();
        
        switch(res){
            case 1: System.out.println("Nueva informacion de la tienda:");
                    System.out.println("Direccion: ");
                    t.setDireccion(leer.next());
                    System.out.println("Representante: ");
                    t.setRepresentante(leer.next());
                    break;
            case 2: System.out.println("Lista de productos:");
                    System.out.println(listaProductos);
                    System.out.println("Ingrese ID de producto:");
                    Integer id = leer.nextInt();
                    modificarProducto(id);
                    break;
            default: System.out.println("Opcion invalida");
                    break;
        }
    }
    
    public void eliminarTienda(Integer id){
        Iterator<Tienda> it = listaTiendas.iterator();
        while(it.hasNext()){
            if(it.next().getIdTienda().equals(id))
                it.remove();
        }
    }
    
    /*
    CrearTienda()
    MostrarTiendas()
    ModificarTienda()
    EliminarTienda()
    
    Además:
    AgregarProductos(): Agrega el producto elegido y la cantidad.
    VenderProductos(): Vende cierta cantidad del producto.
    EliminarProductos(): Elimina el Producto de esa tienda.
    StockProductos(): Nos devuelve cuantos productos hay.
    */
    
    public void agregarProducto(){
        ProductoServicio ps = new ProductoServicio();
        listaProductos.add(ps.crearProducto());
    }
    
    public void venderProducto(Integer id, int cantidad){
        Producto p = buscarProducto(id);
        if( p == null){
            System.out.println("ID no encontrado");
        }else{
            if(p.getCantidad() - cantidad >= 0){
                p.setCantidad(p.getCantidad()-cantidad);
            }else
                System.out.println("No hay suficiente stock disponible");
        }
    }
   
    public void modificarProducto(Integer id){
        Producto p = buscarProducto(id);
        
        if(p == null){
            System.out.println("ID no encontrado");
        }else{
            System.out.println("Nueva informacion del producto:");
            System.out.println("Nombre: ");
            p.setNombre(leer.next());
            System.out.println("Precio: ");
            p.setPrecio(leer.nextDouble());
            System.out.println("Stock disponible:");
            p.setCantidad(leer.nextInt());
        }
    }
    
    public void stockProductos(){
        System.out.println("Cantidad de productos de la tienda: ");
        System.out.println(listaProductos.size());
    }
    
    public void eliminarProducto(Integer id){
        Iterator<Producto> it = listaProductos.iterator();
        Producto p = new Producto();
        while(it.hasNext()){
            if(it.next().getId().equals(id))
                it.remove();
        }
    }
    
    public Producto buscarProducto(Integer id){
        Producto p = new Producto();
        for (Producto producto : listaProductos) {
            if(producto.getId().equals(id)){
                p = producto;
                System.out.println("Producto encontrado");
            }
        }
        return p;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Tienda> getListaTiendas() {
        return listaTiendas;
    }
        
}
