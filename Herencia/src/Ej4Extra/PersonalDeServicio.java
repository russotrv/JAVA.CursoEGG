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
public class PersonalDeServicio extends Empleado {
    /*
    Sobre el personal de servicio, hay que conocer a qué sección están asignados
    (biblioteca, decanato, secretaría, ...).
    */
    
    protected String seccionAsignada;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccionAsignada, Integer anioDeIncorporacion, Integer numDespacho, String nombre, String apellido, String estadoCivil, Integer numIdentificacion) {
        super(anioDeIncorporacion, numDespacho, nombre, apellido, estadoCivil, numIdentificacion);
        this.seccionAsignada = seccionAsignada;
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    private void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    public void cambiarSeccionAsignada(String seccionAsignada){
        setSeccionAsignada(seccionAsignada);
    }
    
    @Override
    public void cambiarEstadoCivil(String estadoCivil){
        super.cambiarEstadoCivil(estadoCivil);
    }
    
    @Override
    public String toString() {
        return super.toString() + "seccionAsignada=" + seccionAsignada + '}';
    }
    
    
}
