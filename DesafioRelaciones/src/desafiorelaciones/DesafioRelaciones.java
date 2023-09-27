/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiorelaciones;

import Entidades.Producto;
import Entidades.Tienda;
import Servicio.TiendaServicio;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class DesafioRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiendaServicio ts = new TiendaServicio();
        ArrayList<Producto> listaProductos = new ArrayList();
        Producto pr1, pr2, pr3;
        Tienda t;
        pr1 = new Producto(001, "Mouse", 5899.99, 10);
        pr2 = new Producto(002,"Teclado Inalambrico", 9999.99, 8);
        pr3 = new Producto(003,"Tableta Grafica", 14999.99, 6);
        listaProductos.add(pr1);
        listaProductos.add(pr2);
        listaProductos.add(pr3);
        t =ts.crearTiendaHardCode(001, listaProductos, "Arana 535", "Rodrigo Verca");
        
        ts.mostrarTienda(t);
        
    }
    
}
