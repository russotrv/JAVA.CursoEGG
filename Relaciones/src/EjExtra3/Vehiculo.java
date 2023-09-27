/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjExtra3;

/**
 *
 * @author Juan
 */
public class Vehiculo {
    //Marca, modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.);
    private String marca, modelo, chasis, color, tipo;
    private Integer numeroMotor, anio;

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(Integer numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo{\n" + "Marca: " + marca + "\nModelo: " + modelo + "\nChasis: " + chasis + "\nColor: " + color + "\nTipo: " + tipo + "\nNumero de motor: " + numeroMotor + "\nAño: " + anio + "\n}";
    }
    
    
    
}
