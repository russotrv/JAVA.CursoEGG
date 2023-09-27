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
public class Camping extends AlojamientoExtraHotelero {
    /*
    capacidad máxima de carpas, la cantidad de baños disponibles
    y si posee o no un restaurante dentro de las instalaciones
    */
    
    protected Integer capacidadMaxCarpas, cantBaniosDisp;
    protected boolean restaurant;

    public Camping() {
    }

    public Camping(Integer capacidadMaxCarpas, Integer cantBaniosDisp, boolean restaurant, boolean privado, Double metrosCuadOcupados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadOcupados, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBaniosDisp = cantBaniosDisp;
        this.restaurant = restaurant;
    }

    
    
    public Integer getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(Integer capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public Integer getCantBaniosDisp() {
        return cantBaniosDisp;
    }

    public void setCantBaniosDisp(Integer cantBaniosDisp) {
        this.cantBaniosDisp = cantBaniosDisp;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacidadMaxCarpas=" + capacidadMaxCarpas + ", cantBaniosDisp=" + cantBaniosDisp + ", restaurant=" + restaurant + '}';
    }    
    
}
