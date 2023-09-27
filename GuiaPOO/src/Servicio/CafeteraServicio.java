/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        Cafetera c = new Cafetera();
        
        System.out.println("Capaciad maxima de la cafetera:");
        c.setCapacidadMaxima(leer.nextInt());
        
        System.out.println("Capacidad actual:");
        c.setCantidadActual(leer.nextInt());
        
        return c;
    }
    
    public void llenarCafetera(Cafetera c){
        c.setCantidadActual(c.getCapacidadMaxima());
    }
    
     public void servirTaza(Cafetera c, int tamTaza){
         System.out.println("Llenando taza...");
         int capacidad = c.getCantidadActual();
         if(tamTaza > capacidad){
             System.out.println("Solo se pudieron servir "+capacidad);
             vaciarCafetera(c);
         }else{
             System.out.println("Cafe servido");
             c.setCantidadActual(capacidad-tamTaza);
         }
     }
    
    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera c, int cantCafe){
        int capacidad = c.getCantidadActual();
        int maxima = c.getCapacidadMaxima();
        
        if(capacidad+cantCafe <= maxima){
            c.setCantidadActual(capacidad+cantCafe);
        }else{
            System.out.println("Capacidad maxima alcanzada");
            System.out.println("La cantidad de cafe excede la capacidad maxima de la cafetera");
            llenarCafetera(c);
        }
    }
    
    public void mostrarCafetera(Cafetera c){
        System.out.println("Capacidad maxima: " +c.getCapacidadMaxima());
        System.out.println("Capacidad actual: "+c.getCantidadActual());
    }
}
