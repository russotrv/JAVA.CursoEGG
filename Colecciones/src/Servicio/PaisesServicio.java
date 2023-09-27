/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class PaisesServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> listaPaises = new HashSet();
    
    private void cargarPais(){
        String p ;
        System.out.println("Ingrese el nombre del pais:");
        p= leer.next();
        listaPaises.add(p);
    }
    
    public void cargarLista(){
        String res = "s";
        do{
            cargarPais();
            System.out.println("Quiere ingresar otro pais(s/n):");
            res = leer.next();
        }while(!res.equals("n"));
        System.out.println("");
        System.out.println("Lista de paises:");
        mostrarLista();
    }
    
    public void mostrarLista(){
        listaPaises.forEach((pais) -> {
            System.out.println(pais);
        });
    }
    
    public void eliminar(String pais){
        Iterator<String> it = listaPaises.iterator();
        while(it.hasNext()){
            if(it.next().equals(pais)){
                it.remove();
            }
        }
    }
}
