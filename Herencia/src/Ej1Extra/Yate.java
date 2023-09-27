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
public class Yate extends Barco{
    protected Integer cantCamarotes, potenciaCV;
    protected Double precio;

    public Yate() {
    }

    public Yate(Integer cantCamarotes, Integer potenciaCV, String matricula, Double eslora, Integer anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.cantCamarotes = cantCamarotes;
        this.potenciaCV = potenciaCV;
    }

    public Integer getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(Integer cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public Double modulo(){
        Double precioFinal = super.modulo() + potenciaCV + cantCamarotes;
        System.out.println("Modulo: " +precioFinal);
        return precioFinal + this.potenciaCV + this.cantCamarotes;
    }
    
    @Override
    public String toString() {
        return super.toString() + "cantCamarotes=" + cantCamarotes + ", potenciaCV=" + potenciaCV + '}';
    }
    
    
    
}
