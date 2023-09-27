/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.Vehiculo;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class VehiculoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    
    public Vehiculo crearVehiculo(){
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Datos del vehiculo:");
        
        System.out.println("Marca;");
        vehiculo.setMarca(leer.next());
        
        System.out.println("Modelo:");
        vehiculo.setModelo(leer.next());
        
        System.out.println("Año");
        vehiculo.setAnio(leer.nextInt());
        
        System.out.println("Tipo:");
        vehiculo.setTipo(leer.next());
        
        return vehiculo;
    }
    
    
    public int moverse(Vehiculo v, int seg){
        String tipo = v.getTipo();
        int dcia, mov=0;
        switch(tipo){
            case "automovil":
                             dcia = 3;
                             mov = seg * dcia;
                             break;
            case "motocicleta":
                                dcia = 2;
                                mov = seg * dcia;
                                break;
            case "bicicleta":
                             dcia = 1;
                             mov = seg * dcia;
                             break;
        }
        return mov;
    }
    
    public int frenarse(Vehiculo v){
        String tipo = v.getTipo();
        int dcia = 0;
        if (tipo.equals("automovil") || tipo.equals("motocicleta")){
            dcia = 2;
        }
        return dcia;
    }
    
}
