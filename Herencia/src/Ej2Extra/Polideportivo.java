/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2Extra;

/**
 *
 * @author Juan
 */
public class Polideportivo extends Edificio{
    //tipoDeInstalacion: abierto o techado;
    protected String nombre, tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoDeInstalacion, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
    
    @Override
    public void calcularSuperficie(){
        System.out.println("Superficie de " + nombre + ": " + super.getAncho()*super.getLargo()+"m2");
    }
    
    @Override
    public void calcularVolumen(){
        System.out.println("Volumen de "+ nombre + ": " + super.getAncho()*super.getLargo()*super.getAlto()+"m3");
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", tipoDeInstalacion=" + tipoDeInstalacion + '}';
    }
    
    
}
