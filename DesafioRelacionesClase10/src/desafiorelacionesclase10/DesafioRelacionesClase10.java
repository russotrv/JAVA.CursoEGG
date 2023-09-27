/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiorelacionesclase10;

import Servicio.ProductoServicio;
import Servicio.TiendaServicio;

/**
 *
 * @author Juan
 */
public class DesafioRelacionesClase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ProductoServicio ps = new ProductoServicio();
       TiendaServicio ts = new TiendaServicio();
       /*
       ps.crearProducto();
       ps.inicializar();
       ps.mostrarProductos();
       ps.modificarProducto();
       ps.mostrarProductos();
       ps.eliminarProducto();
       ps.mostrarProductos();
       */
       //ts.crearTienda();
       ts.inicializarTienda();
       ts.mostrarTienda();
        System.out.println("-----");
       //ts.modificarTienda();
       //ts.mostrarTienda();
       //ts.eliminarTienda();
       //ts.mostrarTienda();
        System.out.println("--- Agregar producto ---");
       ts.agregarProducto();
       ts.mostrarTienda();
        System.out.println("-----");
        System.out.println("--- Vender producto ---");
       ts.venderProducto(3);
       ts.mostrarTienda();
        System.out.println("-----");
        System.out.println("--- Eliminar producto ---");
       ts.eliminarProducto();
       ts.mostrarTienda();
        System.out.println("-----");
       ts.stockProductos();
    }
    
}
