/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Juan
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //setter
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //getter
    public double getRadio() {
        return radio;
    }
    
}
