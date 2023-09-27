/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Lavadora extends Electrodomestico{
    protected Integer carga;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Lavadora() {
        super();
        this.carga = 1;
    }

    public Lavadora(Integer carga, Integer peso, String color, Character consumoEnergetico) {
        super(peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
   public void crearLavadora(){
       
       System.out.println("Creando lavadora:");
       super.crearElectrodomestico();
       System.out.println("Carga: ");
       this.carga = leer.nextInt();
       
   }
   
   @Override 
   public Double precioFinal(){
       Double precioFinal = super.precioFinal();
       if(this.carga > 30)
           precioFinal += 500d;
       this.precio = precioFinal;
       
       return precioFinal;
   }
   
   public void mostrarLavadora(){
       System.out.println("Lavadora:");
       System.out.println("Carga: " + this.carga);
       System.out.println("Peso: " + this.peso);
       System.out.println("Color: " + this.color);
       System.out.println("Precio: " + this.precio);
       System.out.println("Consumo energetico: " + this.consumoEnergetico);
   } 
}
