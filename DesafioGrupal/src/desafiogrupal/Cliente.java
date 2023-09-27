/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogrupal;

/**
 *
 * @author Juan
 */
public class Cliente {
    private int id,edad;
    private String nombre, objetivo;
    private double altura, peso;

    public Cliente() {
    }

    public Cliente(int id, int edad, String nombre, String objetivo, double altura, double peso) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nNombre: " + nombre + "\nEdad: " + edad + "\nObjetivo: " + objetivo + "\nAltura: " + altura + "\nPeso: " + peso;
    }
    
    
}
