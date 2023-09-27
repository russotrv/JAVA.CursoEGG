/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Juan
 */
public class Habitacion {
    private Integer numHabitacion;
    private Date fechaOcupacion;
    private Persona ocupante;
    private Reserva reserva;
            
    public Habitacion() {
    }

    public Habitacion(Integer numHabitacion, Date fechaOcupacion, Persona ocupante, Reserva reserva) {
        this.numHabitacion = numHabitacion;
        this.fechaOcupacion = fechaOcupacion;
        this.ocupante = ocupante;
        this.reserva = reserva;
    }

    public Integer getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(Integer numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public Date getFechaOcupacion() {
        return fechaOcupacion;
    }

    public void setFechaOcupacion(Date fechaOcupacion) {
        this.fechaOcupacion = fechaOcupacion;
    }

    public Persona getOcupante() {
        return ocupante;
    }

    public void setHabitante(Persona ocupante) {
        this.ocupante = ocupante;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        
        if(reserva == null && ocupante == null){
            return "Habitacion {" + "\nNumero: " + numHabitacion + "\nSin reservar" + "\n}\n" ;
        }else
            return "Habitacion {" + "\nNumero: " + numHabitacion + "\nFecha de ocupacion: " + fechaOcupacion + "\nReserva: " + reserva.toString() + "\nOcupante: " + ocupante.toString() + "}\n";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habitacion other = (Habitacion) obj;
        if (!Objects.equals(this.numHabitacion, other.numHabitacion)) {
            return false;
        }
        return true;
    }
    
    
    
}
