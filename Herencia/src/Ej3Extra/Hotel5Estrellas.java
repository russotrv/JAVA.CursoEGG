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
public class Hotel5Estrellas extends Hoteles {
    /*
    Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
    Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones
    */
    
    protected Integer cantSalonesConf, cantSuites, cantLimosinas, capacidadRestaurante;
    protected Character gimnasio;
    protected String nombreRestaurante;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas, Integer capacidadRestaurante, Character gimnasio, String nombreRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Integer estrellas, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, estrellas, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        this.capacidadRestaurante = capacidadRestaurante;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.precioHabitaciones = precioHabitacion();
    }

    public Integer getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(Integer cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Character isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Character gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    
    /*
    PrecioHabitación = precio base + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).
    */
    /*
        Valor agregado por las limosinas:
        • $15 por la cantidad de limosinas del hotel.
    */
    @Override 
    protected final Double precioHabitacion(){
        Double precioHab = super.precioHabitacion() + agregadoRestaurante() + agregadoGimnasio() + 15d*this.cantLimosinas;
        
        return precioHab;
    }

    public Integer agregadoRestaurante(){
        Integer agregado;
        Integer capacidad = this.capacidadRestaurante;
        if(capacidad<30){
            agregado = 10;
        }else if(capacidad >=30 && capacidad <50){
            agregado = 30;
        }else
            agregado = 50;
        return agregado;
    }
    
    public Integer agregadoGimnasio(){
        Integer agregado;
        Character gim = this.gimnasio;
        if(gim.equals('a') || gim.equals('A')){
            agregado = 50;
        }else
            agregado = 30;
        return agregado;
    }

    @Override
    public String toString() {
        return super.toString() + ", cantSalonesConf=" + cantSalonesConf + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + ", capacidadRestaurante=" + capacidadRestaurante + ", gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + '}';
    }
    
   
    
    
}
