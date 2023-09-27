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
public class Hotel4Estrellas extends Hoteles{
    /*
    Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
    */
    
    protected Character gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(Character gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Integer estrellas, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, estrellas, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.precioHabitaciones = precioHabitacion();
    }

    public Character getGimnasio() {
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

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    /*
    PrecioHabitación = precio base + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).
    */
    
    /*
    Valor agregado por el restaurante:
        • $10 si la capacidad del restaurante es de menos de 30 personas.
        • $30 si está entre 30 y 50 personas.
        • $50 si es mayor de 50.
    Valor agregado por el gimnasio:
        • $50 si el tipo del gimnasio es A.
        • $30 si el tipo del gimnasio es B.
    */
    
    @Override 
    protected final Double precioHabitacion (){
        Double precioHab = super.precioHabitacion()
                + agregadoRestaurante() + agregadoGimnasio();
        
     // this.precioHabitaciones = precioHab;
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
        return super.toString() + ", gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }
    
    
}
