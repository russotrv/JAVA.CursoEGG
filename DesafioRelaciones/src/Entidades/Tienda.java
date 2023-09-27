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
    ID de tienda, Lista de productos, direccion, representante de la tienda
    */
    
    private Integer idTienda;
    private ArrayList<Producto> listaProductos;
    private String direccion, representante;

    public Tienda() {
    }

    public Tienda(Integer idTienda, ArrayList<Producto> listaProductos, String direccion, String representante) {
        this.idTienda = idTienda;
        this.listaProductos = listaProductos;
        this.direccion = direccion;
        this.representante = representante;
    }

    public Integer getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Integer idTienda) {
        this.idTienda = idTienda;
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
        return "Tienda{" + "IDTienda=" + idTienda + ", listaProductos=" + listaProductos.toString() + ", direccion=" + direccion + ", representante=" + representante + '}';
    }
    
    
}
