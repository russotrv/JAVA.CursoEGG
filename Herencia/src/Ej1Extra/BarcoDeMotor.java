/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1Extra;

/**
 *
 * @author Juan
 */
public class BarcoDeMotor extends Barco{
    protected Integer potenciaCV;
    protected Double precio;
    
    public BarcoDeMotor() {
    }

    public BarcoDeMotor(Integer potenciaCV, String matricula, Double eslora, Integer anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public Double modulo(){ 
        Double precioFinal = super.modulo() + potenciaCV;
        System.out.println("Modulo: " + precioFinal);
        return precioFinal + this.potenciaCV;
    }
    
    @Override
    public String toString() {
        return super.toString() + "potenciaCV=" + potenciaCV + '}';
    }

    
    
}
