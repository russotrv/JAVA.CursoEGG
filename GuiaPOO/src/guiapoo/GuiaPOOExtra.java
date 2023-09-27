/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo;
/*

import Entidades.Cancion;
import Entidades.NIF;
import Entidades.Puntos;
import Entidades.Raices;
import Servicio.MesServicio;
import Servicio.NIFServicio;
import Servicio.PuntosServicio;
import Servicio.RaicesServicio;
*/
import java.util.Scanner;
import Entidades.Ahorcado;
import Servicio.AhorcadoServicio;
/**
 *
 * @author Juan
 */
public class GuiaPOOExtra {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        /*Ej1
        Cancion c = new Cancion();
        System.out.println("Ingrese el titulo de la cancion:");
        c.setTitulo(leer.next());
        System.out.println("Ingrese el autor:");
        c.setAutor(leer.next());
        System.out.println(c.toString());
        */
        
        /*Ej2
        PuntosServicio ps = new PuntosServicio();
        Puntos p;
        p = ps.crearPuntos();
        System.out.println("La distancia entre los puntos es: " + ps.calcularDistancia(p));
        */
        
        /*Ej3
        RaicesServicio rs = new RaicesServicio();
        Raices r = rs.crearRaices();
        rs.obtenerRaices(r);
        */
        
        /*Ej4
        NIFServicio ns = new NIFServicio();
        NIF n = ns.crearNIF();
        ns.mostrarNIF(n);
        */
        
        /*Ej5
        MesServicio ms = new MesServicio();
        ms.jugar();
        */
        
        /*Ej6
        AhorcadoServicio as = new AhorcadoServicio();
        Ahorcado a = as.crearJuego();
        as.juego(a);
        */
    }
}
