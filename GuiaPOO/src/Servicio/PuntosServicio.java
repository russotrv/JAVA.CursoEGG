/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class PuntosServicio {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos p = new Puntos();
        System.out.println("Ingrese las coordenadas:");
        
        System.out.println("x1:");
        p.setX1(leer.nextInt());
        
        System.out.println("y1:");
        p.setY1(leer.nextInt());
        
        System.out.println("x2:");
        p.setX2(leer.nextInt());
        
        System.out.println("y2:");
        p.setY2(leer.nextInt());
        
        return p;
    }
    
    public double calcularDistancia(Puntos p){
        double distancia, dciaX, dciaY;
        dciaX = p.getX2()-p.getX1();
        dciaY = p.getY2()-p.getY1();
        distancia = Math.sqrt(Math.pow(dciaX,2)+Math.pow(dciaY,2));
        
        return distancia;
    }
    
}
