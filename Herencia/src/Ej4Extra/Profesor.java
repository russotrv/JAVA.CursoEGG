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
public class Profesor extends Empleado {
    /*
    Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen
    (lenguajes, matemáticas, arquitectura, ...).
    */
    
    protected String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, Integer anioDeIncorporacion, Integer numDespacho, String nombre, String apellido, String estadoCivil, Integer numIdentificacion) {
        super(anioDeIncorporacion, numDespacho, nombre, apellido, estadoCivil, numIdentificacion);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    private void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String nuevoDepartamento){
        setDepartamento(nuevoDepartamento);
    }
    
    @Override
    public void cambiarEstadoCivil(String estadoCivil){
        super.cambiarEstadoCivil(estadoCivil);
    }
    
    @Override
    public String toString() {
        return super.toString() + "departamento=" + departamento + '}';
    }
    
    
}
