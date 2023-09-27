/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3Extra;

import java.util.Comparator;

/**
 *
 * @author Juan
 */
public class Hoteles extends Alojamiento {
    //Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos, Precio de Habitaciones
    
    protected Integer cantHabitaciones, numCamas, cantPisos, estrellas;
    protected Double precioHabitaciones;

    public Hoteles() {
    }

    public Hoteles(Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Integer estrellas, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        //this.precioHabitaciones = precioHabitaciones;
        if(estrellas == 4 || estrellas ==5)
            this.estrellas = estrellas;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public Integer getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Integer estrellas) {
        this.estrellas = estrellas;
    }

    /*
    PrecioHabitación = $50 + ($1 x capacidad del hotel) 
    -- PRECIO BASE --
    */
    protected Double precioHabitacion(){
        Double precioHab = 50d + this.cantHabitaciones;
        this.precioHabitaciones = precioHab;
        return precioHab;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", estrellas=" + estrellas + ", precioHabitaciones=" + precioHabitaciones;
    }
    
    public static Comparator<Hoteles> compararPrecioDesc = new Comparator<Hoteles>(){
      @Override
      public int compare(Hoteles h1, Hoteles h2){
          return h2.getPrecioHabitaciones().compareTo(h1.getPrecioHabitaciones());
      }
    };
    
}
