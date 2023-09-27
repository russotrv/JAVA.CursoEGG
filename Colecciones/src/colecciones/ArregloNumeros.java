/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class ArregloNumeros {
    private ArrayList<Integer> listaNumeros;

    public ArregloNumeros() {
        listaNumeros = new ArrayList();
    }

    public ArregloNumeros(ArrayList listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public ArrayList getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    
    
}
