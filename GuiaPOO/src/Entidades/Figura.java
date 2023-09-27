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
public class Figura {
    private String tipo;

    public Figura() {
    }

    public Figura(String tipo) {
        this.tipo = tipo;
    }
    
    //Setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //Getter
    public String getTipo() {
        return tipo;
    }
    
    
}
