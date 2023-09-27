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
public class AlojamientoExtraHotelero extends Alojamiento {
    /*
    se indica si es privado o no, así como la cantidad de metros cuadrados que ocupa
    */
    protected boolean privado;
    protected Double metrosCuadOcupados;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean privado, Double metrosCuadOcupados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadOcupados = metrosCuadOcupados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Double getMetrosCuadOcupados() {
        return metrosCuadOcupados;
    }

    public void setMetrosCuadOcupados(Double metrosCuadOcupados) {
        this.metrosCuadOcupados = metrosCuadOcupados;
    }

    @Override
    public String toString() {
        return super.toString() + ", privado=" + privado + ", metrosCuadOcupados=" + metrosCuadOcupados;
    }
    
    
}

