/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioherencia;

import java.util.Date;

/**
 *
 * @author Juan
 */
public class Adulto extends Integrante {
    protected boolean obraSocial;

    public Adulto() {
    }

    public Adulto(boolean obraSocial, Integer numOrden, Persona vinculo, ProblemaDeSalud probDeSalud, AbordajeNutricional abordajeNut, boolean tieneProbSalud, boolean tieneAbordajeNut, String nombre, String apellido, String sexo, Date fechaNacimiento, Integer dni) {
        super(numOrden, vinculo, probDeSalud, abordajeNut, tieneProbSalud, tieneAbordajeNut, nombre, apellido, sexo, fechaNacimiento, dni);
        this.obraSocial = obraSocial;
    }


    public boolean isObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(boolean obraSocial) {
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return super.toString() + "obraSocial=" + obraSocial + '}';
    }
    
    
}
