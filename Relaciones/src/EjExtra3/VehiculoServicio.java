/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjExtra3;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class VehiculoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Vehiculo gestionDeVehiculos(){
        Vehiculo v = new Vehiculo();
        System.out.println("Ingrese informacion del vehiculo: ");
        
        System.out.println("Marca: ");
        v.setMarca(leer.next());
        
        System.out.println("Modelo: ");
        v.setModelo(leer.next());
        
        System.out.println("Tipo:");
        v.setTipo(leer.next());
        
        System.out.println("Chasis: ");
        v.setChasis(leer.next());
        
        System.out.println("Numero de motor: ");
        v.setNumeroMotor(leer.nextInt());
        
        System.out.println("Año: ");
        v.setAnio(leer.nextInt());
        
        System.out.println("Color: ");
        v.setColor(leer.next());
        
        return v;
    }
}
