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
public class Rectangulo implements calculosFormas {
    private Double base, altura;

    public Rectangulo() {
    }
    
    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    @Override
    public Double calcularPerimetro() {
       return this.base * 2  + this.altura * 2; 
    }

    @Override
    public Double calcularArea() {
        return this.base * this.altura;
    }
    
}
