/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author Juan
 */
public class Circulo implements calculosFormas {
    //PI * radio ^ 2 
    //Perímetro circulo: PI * diámetro
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    @Override
    public Double calcularPerimetro() {
        return PI * this.radio * 2;
    }

    @Override
    public Double calcularArea() {
        return PI * Math.pow(this.radio, 2);
    }
    
}
