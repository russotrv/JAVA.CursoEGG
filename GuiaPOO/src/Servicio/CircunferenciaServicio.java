/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.Circunferencia;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class CircunferenciaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        Circunferencia c = new Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferencia:");
        c.setRadio(leer.nextDouble());
        
        return c;
    }
    
    public double area(Circunferencia c){
        return Math.pow(c.getRadio(), 2) * Math.PI;
    }
    
    public double perimetro(Circunferencia c){
        return Math.PI * 2 * c.getRadio();
    }
}
