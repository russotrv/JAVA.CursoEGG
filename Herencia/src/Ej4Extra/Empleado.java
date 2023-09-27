/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4Extra;

/**
 *
 * @author Juan
 */
public class Empleado extends Persona{
    /*
    Con respecto a los empleados, sean del tipo que sean, hay que saber
    su año de incorporación a la facultad y qué número de despacho tienen asignado.
    */
    
    protected Integer anioDeIncorporacion, numDespacho;

    public Empleado() {
    }

    public Empleado(Integer anioDeIncorporacion, Integer numDespacho, String nombre, String apellido, String estadoCivil, Integer numIdentificacion) {
        super(nombre, apellido, estadoCivil, numIdentificacion);
        this.anioDeIncorporacion = anioDeIncorporacion;
        this.numDespacho = numDespacho;
    }

    public Integer getAnioDeIncorporacion() {
        return anioDeIncorporacion;
    }

    private void setAnioDeIncorporacion(Integer anioDeIncorporacion) {
        this.anioDeIncorporacion = anioDeIncorporacion;
    }

    public Integer getNumDespacho() {
        return numDespacho;
    }

    private void setNumDespacho(Integer numDespacho) {
        this.numDespacho = numDespacho;
    }

    public void cambiarNumeroDespacho(Integer numDespacho){
        setNumDespacho(numDespacho);
    }
    
    @Override
    public void cambiarEstadoCivil(String estadoCivil){
        super.cambiarEstadoCivil(estadoCivil);
    }
    
    @Override
    public String toString() {
        return super.toString() + "anioDeIncorporacion=" + anioDeIncorporacion + ", numDespacho=" + numDespacho;
    }
    
    
}
