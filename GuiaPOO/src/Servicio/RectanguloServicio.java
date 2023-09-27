/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class RectanguloServicio {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        Rectangulo r = new Rectangulo();
        
        System.out.println("Ingrese la base del rectangulo");
        r.setBase(leer.nextDouble());
        
        System.out.println("Ingrese la altura del rectangulo:");
        r.setAltura(leer.nextDouble());
        
        return r;
    }
    
    public double perimetro(Rectangulo r){
        return (r.getBase() + r.getAltura()) * 2;
    }
    
    public double area(Rectangulo r){
        return r.getBase() * r.getAltura();
    }
    
    public void mostrarRectangulo(Rectangulo r){
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if(i == 0 || i == r.getAltura()-1 || j == 0 || j == r.getBase()-1){
                    System.out.print("* ");
                }else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}
