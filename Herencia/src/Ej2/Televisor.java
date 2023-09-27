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
public class Televisor extends Electrodomestico{
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Integer resolucion;
    protected boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = 0;
        this.sintonizadorTDT = false;
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, Integer peso, String color, Character consumoEnergetico) {
        super(peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        
        System.out.println("Creando televisor: ");
        super.crearElectrodomestico();
        System.out.println("Resolucion: ");
        this.resolucion = leer.nextInt();
        System.out.println("Sintonizador TDT (s/n): ");
        Character res = leer.next().charAt(0);
        if(res.equals('s'))
            this.sintonizadorTDT = true;
    
    }
    @Override
    public Double precioFinal(){
        Double precioFinal = super.precioFinal();
        if(this.resolucion > 40)
            precioFinal += precioFinal * 0.3;
        if(this.sintonizadorTDT == true)
            precioFinal += 500d;
        
        this.precio = precioFinal;
        
        return precioFinal;
    }
    
    public void mostrarTelevisor(){
       System.out.println("Televisor: ");
       System.out.println("Resolucion: " + this.resolucion);
       System.out.println("Sintonizador TDT: " + this.sintonizadorTDT);
       System.out.println("Peso: " + this.peso);
       System.out.println("Color: " + this.color);
       System.out.println("Precio: " + this.precio);
       System.out.println("Consumo energetico: " + this.consumoEnergetico);
    }
}
