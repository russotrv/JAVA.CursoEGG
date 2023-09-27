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
public class Persona {
    /*
    Por cada persona, se debe conocer, al menos, su nombre y apellidos,
    su número de identificación y su estado civil.
    */
    
    protected String nombre, apellido, estadoCivil;
    protected Integer numIdentificacion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String estadoCivil, Integer numIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.numIdentificacion = numIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    private void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getNumIdentificacion() {
        return numIdentificacion;
    }

    private void setNumIdentificacion(Integer numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public void cambiarEstadoCivil(String estadoCivil){
        setEstadoCivil(estadoCivil);
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", numIdentificacion=" + numIdentificacion;
    }
    
    
}
