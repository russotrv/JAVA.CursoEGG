/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author Juan
 */
public class EjemploArray {
    protected Integer[] listaNumeros = new Integer[5];

    public EjemploArray() {
    }
    
    public void cargarListaNum(Integer[] listaN){
        for (int i = 0; i < listaN.length; i++) {
            listaNumeros[i] = listaN[i];
        }
    }

    public Integer[] getListaNumeros() {
        return listaNumeros;
    }
    public void mostrarLista(){
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i] + " ");
        }
    }
    
    
}
