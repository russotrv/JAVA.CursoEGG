/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.Habitacion;
import colecciones.Persona;
import colecciones.Reserva;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Hotel {
    private ArrayList<Habitacion> listaHabitaciones;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //private int capacidadMax[] = {2, 2, 2, 2, 2, 3, 3, 3, 1, 1};
    
    public Hotel() {
        listaHabitaciones = new ArrayList();
    }

    public void cargarListaHab(){
        Habitacion h = new Habitacion();
        System.out.println("Numero:");
        h.setNumHabitacion(leer.nextInt());
        listaHabitaciones.add(h);
    } 
    
    public ArrayList listaHabitaciones(){
        Collections.sort(listaHabitaciones, ComparadorHabitacion.ordenarPorNumHabAsc);
        return listaHabitaciones;
    }
    
    public void realizarReserva(Habitacion h, Integer numHab){
            h.setReserva(cargarReserva(numHab));
            System.out.println("Reserva registrada!");
            h.setHabitante(cargarInfoPersona());
            System.out.println(h.getOcupante().getNombre() + " registrado en la reserva de habitacion " +numHab);
            System.out.println("Fecha de ocupación prevista de la habitacion " + numHab);
            h.setFechaOcupacion(fechaOcupacion());
    }
    
    public void modificarReserva(Habitacion h){
        Reserva r;
        int opc;
        
        r = h.getReserva();
        opc = menuModificar();
        switch(opc){
            case 1: 
                    System.out.println("Numero de habitacion reasignada");
                    Integer numHab = leer.nextInt();
                    r.setNumHabitacion(numHab);
                    break;
            case 2: 
                    System.out.println("Cantidad de personas reasignadas");
                    Integer cantPersonas = leer.nextInt();
                    r.setCantPersonas(cantPersonas);
                    break;
            case 3: 
                    int dia, mes, anio;
                    Date fecha;
                    System.out.println("Nueva fecha de reserva:");
                    System.out.println("Dia, mes, año:");
                    dia = leer.nextInt(); mes = leer.nextInt(); anio = leer.nextInt();
                    fecha = new Date(dia,mes,anio);
                    break;  
        }
    }
    
    public int menuModificar(){
        int opc;
        System.out.println("Que modificara de la reserva:");
        System.out.println("1. Numero de habitacion");
        System.out.println("2. Cantidad de personas");
        System.out.println("3. Fecha");
        opc = leer.nextInt();
        return opc;
    }
    
    public boolean buscarHabitacionNum(Integer numHab){
        boolean esta = false;
        System.out.println("--Buscando habitacion--");
        
        for (Habitacion habitacion : listaHabitaciones) {
            if(Objects.equals(habitacion.getNumHabitacion(), numHab)){
                System.out.println("Habitacion encontrada");
                esta = true;
            }
        }
        return esta;
    }
    
    public boolean buscarHabitacionID(Integer numID){
        boolean esta = false;
        Reserva r;
        System.out.println("--Buscando habitacion--");
        
        for (Habitacion habitacion : listaHabitaciones) {
            r = habitacion.getReserva();
            if((r != null) && r.getId().equals(numID)){
                    System.out.println("Habitacion encontrada");
                    esta = true;
                    break;
            }
        }
        
        return esta;
    }
    
    public Habitacion devolverHabitacionNum(Integer numHab){
        Habitacion h = new Habitacion();
        
        for (Habitacion habitacion : listaHabitaciones) {
            if(Objects.equals(habitacion.getNumHabitacion(), numHab)){
                return habitacion;
            }
        }
        return h;
    }    
        
    public Habitacion devolverHabitacionID(Integer numID){
        Habitacion h = new Habitacion();
        
        for (Habitacion habitacion : listaHabitaciones) {
            if(habitacion.getReserva()==null){
            }else{
                if(habitacion.getReserva().getId().equals(numID)){
                    return habitacion;
                }
            }        
        }
        return h;
    }
        
    public Date fechaOcupacion(){
        Date fecha;
        int dia,mes,anio;
        
        System.out.println("Dia: ");
        dia = leer.nextInt(); 
        System.out.println("Mes: ");
        mes = leer.nextInt(); 
        System.out.println("Año: ");
        anio = leer.nextInt();
        
        fecha = new Date(dia,mes,anio);
        
        return fecha;
    }
    
    
    public void eliminarReserva(Habitacion h){
        int numHab;
        numHab = h.getNumHabitacion();
        listaHabitaciones.remove(h);
        System.out.println("Reserva eliminada");
        h = new Habitacion();
        h.setNumHabitacion(numHab);
        listaHabitaciones.add(h);
    }
    
    private Persona cargarInfoPersona(){
        Persona p = new Persona();
        
        System.out.println("Ingrese datos de la persona que reserva:");
        System.out.println("Nombre: ");
        p.setNombre(leer.next());
        System.out.println("Edad: ");
        p.setEdad(leer.nextInt());
        System.out.println("País: ");
        p.setPais(leer.next());
        System.out.println("DNI:");
        p.setDni(leer.nextInt());
        return p;
    }
    
    private Reserva cargarReserva(Integer numHab){
        Reserva r = new Reserva();
        int dia, mes, anio;
        Date fecha;
        
        r.setAlojamiento(true);
        System.out.println("ID Reserva:");
        r.setId(leer.nextInt());
        
        r.setNumHabitacion(numHab);
        
        System.out.println("Cantidad de personas");
        //chequear tema capacidad por habitacion
        r.setCantPersonas(leer.nextInt());
        
        System.out.println("Fecha de reserva:");
        System.out.println("Dia:");
        dia = leer.nextInt();
        System.out.println("Mes:");
        mes = leer.nextInt();
        System.out.println("Año:");
        anio = leer.nextInt();
        fecha = new Date(dia,mes,anio);
        r.setFecha(fecha);
        
        return r;
    }
}
