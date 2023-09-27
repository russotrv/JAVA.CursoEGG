/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1Extra;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Juan
 */
public class Alquiler {
    /*
    el nombre, documento del cliente, la fecha de alquiler, fecha de devolución,
    la posición del amarre y el barco que lo ocupará.
    */
    private String nombreCliente;
    private Integer documentoCliente, posicionOcupada;
    private Date fechaAlquiler, fechaDevolucion;
    private Barco barcoOcupado;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, Integer documentoCliente, Integer posicionOcupada, Date fechaAlquiler, Date fechaDevolucion) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.posicionOcupada = posicionOcupada;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombre) {
        this.nombreCliente = nombre;
    }

    public Integer getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(Integer documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Integer getPosicionOcupada() {
        return posicionOcupada;
    }

    public void setPosicionOcupada(Integer posicionOcupada) {
        this.posicionOcupada = posicionOcupada;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarcoOcupado() {
        return barcoOcupado;
    }

    public void setBarcoOcupado(Barco barcoOcupado) {
        this.barcoOcupado = barcoOcupado;
    }
    
    public Double precio(){
        Double precioFinal;
        
        long diferenciaMS = this.fechaDevolucion.getTime() - this.fechaAlquiler.getTime();
        // Convertimos la diferencia de milisegundos a días
        long diferenciaEnDias = TimeUnit.MILLISECONDS.toDays(diferenciaMS);
        System.out.println("Dias alquilados: " + diferenciaEnDias);
        
        precioFinal = diferenciaEnDias * this.barcoOcupado.modulo();
        
        return precioFinal;
    }
    
    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombreCliente + ", documentoCliente=" + documentoCliente + ", posicionOcupada=" + posicionOcupada + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", barcoOcupado=" + barcoOcupado.toString();
    }
    
    
}
