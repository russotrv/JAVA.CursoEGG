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
public class Tienda {
    /*
    atributos: ID de tienda, Lista de productos, direccion, representante de la tienda
    */
    private Integer idTienda;
    private ArrayList<Producto> listaProductos;
    private String direccion, representante;
    private static Integer contadorIDTienda = 0;

    public Tienda() {
       // listaProductos = new ArrayList();
    }

    public Tienda(ArrayList<Producto> listaProductos, String direccion, String representante) {
        contadorIDTienda ++;
        this.idTienda = contadorIDTienda;
        this.listaProductos = listaProductos;
        this.direccion = direccion;
        this.representante = representante;
    }

    public Integer getIdTienda() {
        return idTienda;
    }

    public void setIdTienda() {
        contadorIDTienda++;
        this.idTienda = contadorIDTienda;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Tienda{\n" + "IDTienda: " + idTienda + "\nLista de Productos: " + listaProductos.toString() + "\nDireccion: " + direccion + "\nRepresentante: " + representante + "\n}";
    }

    
    
}
