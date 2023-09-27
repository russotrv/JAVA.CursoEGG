/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjExtra3;

import java.util.Date;

/**
 *
 * @author Juan
 */
public class Poliza {
    /*número de póliza, fecha de inicio y fin de la póliza,
    cantidad de cuotas, forma de pago, monto total asegurado,
    incluye granizo, monto máximo granizo, tipo de cobertura (total, contra terceros, etc.)
    */
    
    private Integer numeroPoliza, cantCuotas;
    private Date inicio, fin;
    private String formaPago, tipoCobertura;
    private Double montoTotalAsegurado, montoMaximoGranizo;
    private boolean incluyeGranizo;
    private Cliente cliente;
    private Cuotas cuotas;

    public Poliza() {
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public Double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    @Override
    public String toString() {
        return "Poliza{\n" + "Numero de poliza: " + numeroPoliza + "\nCantidad de cuotas: " + cantCuotas + "\nInicio: " + inicio + "\nFin: " + fin + "\nForma de pago: " + formaPago + "\nTipo de cobertura: " + tipoCobertura + "\nMonto total asegurado: " + montoTotalAsegurado + "\nMonto maximo granizo:" + montoMaximoGranizo + "\nIncluye granizo: " + incluyeGranizo + cliente.toString() + cuotas.toString() +"\n}";
    }  
        
}
