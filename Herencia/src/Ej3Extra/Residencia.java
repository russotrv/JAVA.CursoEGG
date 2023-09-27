/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3Extra;

/**
 *
 * @author Juan
 */
public class Residencia extends AlojamientoExtraHotelero {
    /*
    indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
    si posee o no campo deportivo
    */
    protected Integer cantHabitaciones;
    protected boolean dtoGremios, campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, boolean dtoGremios, boolean campoDeportivo, boolean privado, Double metrosCuadOcupados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadOcupados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.dtoGremios = dtoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDtoGremios() {
        return dtoGremios;
    }

    public void setDtoGremios(boolean dtoGremios) {
        this.dtoGremios = dtoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() + ", cantHabitaciones=" + cantHabitaciones + ", dtoGremios=" + dtoGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
    
}
