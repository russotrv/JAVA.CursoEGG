/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioexcepciones;

/**
 *
 * @author Juan
 */
public class ObjetoRadar {
    //Ubicacion en el espacio del objeto x y z
    protected Integer x,y,z;
    protected Double resistencia;
    protected boolean hostil;

    public ObjetoRadar() {
    }

    public ObjetoRadar(Integer x, Integer y, Integer z, boolean hostil, Double resistencia) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.hostil = hostil;
        this.resistencia = resistencia;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public Double getResistencia() {
        return resistencia;
    }

    public void setResistencia(Double resistencia) {
        this.resistencia = resistencia;
    }
    
    
    
}
