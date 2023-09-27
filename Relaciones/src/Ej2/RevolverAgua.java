/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej02;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Juan
 */
public class RevolverAgua {
    private Integer posActual, posAgua;
    Random random = new Random();
    
    
    public RevolverAgua() {
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }
    
    public void llenarRevolver(){
        setPosActual(random.nextInt(6-1+1)+1);
        setPosAgua(random.nextInt(6-1+1)+1);
    }
    
    public boolean mojar(){
        return Objects.equals(getPosActual(), getPosAgua());
    }
    
    public void siguienteChorro(){
        if(getPosActual()==6){
            setPosActual(1);
        }else
            setPosActual(getPosActual()+1);
    }

    @Override
    public String toString() {
        return "{" + "\nPosicion actual: " + posActual + "\nPosicion agua: " + posAgua + "\n}";
    }
    
    
    
}
