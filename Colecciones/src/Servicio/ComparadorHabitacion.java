/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.Habitacion;
import java.util.Comparator;

/**
 *
 * @author Juan
 */
public class ComparadorHabitacion {
    public static Comparator<Habitacion> ordenarPorNumHabAsc = new Comparator<Habitacion>() {
        @Override
        public int compare(Habitacion h1, Habitacion h2) {
            return h1.getNumHabitacion().compareTo(h2.getNumHabitacion());
        }
    };
    
    public static Comparator<Habitacion> ordenarPorNumHabDesc = new Comparator<Habitacion>() {
        @Override
        public int compare(Habitacion h1, Habitacion h2) {
            return h2.getNumHabitacion().compareTo(h1.getNumHabitacion());
        }
    };
}
