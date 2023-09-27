/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class HotelServicio {
    private Hotel hotel;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HotelServicio() {
        hotel = new Hotel();
    }
    
    public void cargarHabitaciones(int cantHab){
        System.out.println("Cargar lista de habitaciones del hotel:");
        for (int i = 0; i < cantHab; i++) {
            System.out.println("Habitacion["+(i+1)+"]:");
            hotel.cargarListaHab();
        }
    }
    
    public void reservarHabitacion(){
        System.out.println("Numero de la habitación a reservar:");
        Integer numHab = leer.nextInt();
        Habitacion h;
        if(hotel.buscarHabitacionNum(numHab)){
           h = hotel.devolverHabitacionNum(numHab);
           hotel.realizarReserva(h, numHab);
        }else
            System.out.println("Numero de reserva incorrecto");
    }
    
    public void buscarHabitacion(){
        System.out.println("Numero de la habitación a buscar:");
        Integer numHab = leer.nextInt();
        Habitacion h;
        if(hotel.buscarHabitacionNum(numHab)){
            h = hotel.devolverHabitacionNum(numHab);
            System.out.println("La habitacion se encuentra en la lista");
            System.out.println(h.toString());
        }else
            System.out.println("La habitacion no esta en la lista");
    }
    
    public void modificarReserva(){
        System.out.println("ID de reserva a modificar:");
        Integer numID = leer.nextInt();
        Habitacion h;
        if(hotel.buscarHabitacionID(numID)){
            h = hotel.devolverHabitacionID(numID);
            hotel.modificarReserva(h);
        }else
            System.out.println("El numero de reserva NO es correcto");
        
    }
    
    public void eliminarReserva(){
        System.out.println("ID de reserva a eliminar");
        Integer numID = leer.nextInt();
        Habitacion h;
        if(hotel.buscarHabitacionID(numID) == true){
            h = hotel.devolverHabitacionID(numID);
            hotel.eliminarReserva(h);
        }else
            System.out.println("El numero de reserva NO es correcto");
    }
    
    public ArrayList listaHabitaciones(){
        return hotel.listaHabitaciones();
    }
}
