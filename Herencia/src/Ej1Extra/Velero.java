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
public class Velero extends Barco {
    protected Integer numMastiles;

    public Velero() {
    }
   
    public Velero(Integer numMastiles, String matricula, Double eslora, Integer anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.numMastiles = numMastiles;
    }

    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }
    
    @Override
    public Double modulo(){
        Double precioFinal = super.modulo() + numMastiles ;
        System.out.println("Modulo: " + precioFinal);
        return precioFinal + this.numMastiles;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nnumMastiles=" + numMastiles + '}';
    }
    
    
}
