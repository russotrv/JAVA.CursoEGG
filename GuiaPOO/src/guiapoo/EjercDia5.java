/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo;

import Entidades.Figura;
import Entidades.Vehiculo;
import Servicio.VehiculoServicio;
import Servicio.FiguraServicio;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class EjercDia5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        /*VehiculoServicio vs = new VehiculoServicio();
        int[] dciaFinal = new int[3];
        int seg;
        
        for (int i = 0; i < 3; i++) {
            Vehiculo v = new Vehiculo();
            v = vs.crearVehiculo();
            System.out.println("Tiempo que se mueve");
            seg = leer.nextInt();
            dciaFinal[i] = vs.moverse(v, seg) + vs.frenarse(v);
            System.out.println(v.getTipo()+ " se movio " + dciaFinal[i]+ " metros");
        }
        
        int mayor = 0;
        int vehiculo = 0;
        for (int i = 0; i < 3; i++) {
            if (dciaFinal[i]> mayor){
                mayor = dciaFinal[i];
                vehiculo = i+1;
            }
        }
        System.out.println("El vehiculo " + vehiculo + " es el que mas se desplazo: "+ mayor +" metros");
        */
        
        FiguraServicio sf = new FiguraServicio();
        
        double per, area;
        String res = "";
        do{
            Figura f = sf.crearFigura();
            per = sf.Perimetro(f);
            System.out.println(f.getTipo()+"\nPerimetro: "+per);
            area = sf.Area(f);
            System.out.println("Area: "+area);
            System.out.println("Calcular otra figura(s/n):");
            res = leer.next();
        }while(!res.equals("n"));
        
    }
    
}
