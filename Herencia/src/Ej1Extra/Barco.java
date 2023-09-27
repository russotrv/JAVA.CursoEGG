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
public class Barco{
    protected String matricula;
    protected Integer anioDeFabricacion;
    protected Double eslora;
    //protected Alquiler alquiler;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, Integer anioDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
        //this.alquiler = alquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setFechaFabricacion(Integer anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }
    
    public Double modulo(){
        return this.eslora * 10.0;
    }
    
    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", fechaFabricacion=" + anioDeFabricacion;
    }
    
    
    
}
