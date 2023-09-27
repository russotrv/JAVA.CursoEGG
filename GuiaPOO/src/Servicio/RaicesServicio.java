/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class RaicesServicio {
    Scanner leer = new Scanner(System.in);
    
    public Raices crearRaices(){
        Raices r = new Raices();
        
        System.out.println("Ingrese valores de coeficientes a, b y c:");
        r.setA(leer.nextInt());
        r.setB(leer.nextInt());
        r.setC(leer.nextInt());
        
        return r;
    }
    
    public int getDiscriminante(Raices r){
        int discriminante = -1;
        
        discriminante = (int)(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC()) ;
        
        return discriminante;
    }
    
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r) > 0; 
    }
    
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r) == 0; 
    }
    
    public void obtenerRaices(Raices r){
        if(tieneRaices(r)){
            calcularRaiz(r);
        } else if(tieneRaiz(r)){
            obtenerRaiz(r);
        } else
            System.out.println("No tiene raices reales");
    }
    
    public void obtenerRaiz(Raices r){
        if(tieneRaiz(r)){
            int raiz = (-1)* r.getB() / (r.getA()*2);
            System.out.println("La raiz doble es: " + raiz);
        }
    }
    
    public void calcularRaiz(Raices r){
        int raiz1, raiz2;
        raiz1 = ((-1) * r.getB() + getDiscriminante(r)) / 2 * r.getA();
        raiz2 = ((-1) * r.getB() - getDiscriminante(r)) / 2 * r.getA();
        System.out.println("Las raices son:");
        System.out.println(raiz1);
        System.out.println(raiz2);
    }
}
