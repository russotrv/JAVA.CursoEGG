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
public class Cuotas {
    /*  número de cuota, monto total de la cuota, si está o no pagada, 
        fecha de vencimiento, forma de pago (efectivo, transferencia,etc.)
    */
    private String formaPago;
    private Integer numeroCuota;
    private Double montoTotalCuota;
    private boolean cuotaPaga;
    private Date fechaVencimiento;

    public Cuotas() {
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(Double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Cuotas{\n" + "Forma de pago: " + formaPago + "\nNumero de cuota:" + numeroCuota + "\nMonto total de cuota: " + montoTotalCuota + "\nCuota paga: " + cuotaPaga + "\nFecha de vencimiento: " + fechaVencimiento + "\n}";
    }
      
}
