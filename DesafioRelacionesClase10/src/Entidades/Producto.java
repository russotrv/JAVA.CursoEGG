/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Producto {
    /*
    atributos: id, nombre, inventario y precio.
    */
    private Integer id, inventario;
    //private ArrayList<Integer> inventario;
    private String nombre;
    private Double precio;
    private static Integer contadorID = 0;

    public Producto() {
    }
    
    public Producto(String nombre, Double precio, Integer inventario) {
        contadorID++;
        this.id = contadorID;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public Integer getId() {
        return id;
    }

    public void setId() {
        contadorID++;
        this.id = contadorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario=inventario;
    }
    
    @Override
    public String toString() {
        return "Producto{\n" + "ID: " + id + "\nNombre: " + nombre + "\nPrecio:" + precio +"\nInventario:"+ inventario +"\n}";
    }
    
}
