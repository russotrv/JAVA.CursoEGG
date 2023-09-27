/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Date;

/**
 *
 * @author Juan
 */
public class Reserva {
    private Integer id, numHabitacion, cantPersonas;
    private Date fecha;
    private boolean alojamiento;

    public Reserva() {
    }

    public Reserva(Integer id, Integer numHabitacion, Integer cantPersonas, Date fecha) {
        this.id = id;
        this.numHabitacion = numHabitacion;
        this.cantPersonas = cantPersonas;
        this.fecha = fecha;
        this.alojamiento = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(Integer numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(boolean alojamiento) {
        this.alojamiento = alojamiento;
    }
    
    
    @Override
    public String toString() {
        return "\n{" + "ID: " + id + "\nNumero de Habitacion: " + numHabitacion + "\nCantidad de Personas: " + cantPersonas + "\nFecha: " + fecha + "\nAlojamiento: " + alojamiento + "}";
    }
    
    
    
}
