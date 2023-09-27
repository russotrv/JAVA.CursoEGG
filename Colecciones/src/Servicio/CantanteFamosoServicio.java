/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class CantanteFamosoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<CantanteFamoso> listaCantantes;
    private CantanteFamoso cantante;

    public CantanteFamosoServicio() {
        listaCantantes = new ArrayList();
    }
    
    public CantanteFamoso crearCantante(){
        cantante = new CantanteFamoso();
        System.out.println("Nombre:");
        cantante.setNombre(leer.next());
        System.out.println("Nombre del Disco más Vendido:");
        cantante.setDiscoMasVendido(leer.next());
        return cantante;
    }
    
    public ArrayList cargarLista(int cantCantantes){
        System.out.println("Ingrese información de los "+cantCantantes+ " cantantes a agregar a la lista:");
        for (int i = 0; i < cantCantantes; i++) {
            System.out.println("Cantante["+(i+1)+"]:");
            listaCantantes.add(crearCantante());
        }
        return listaCantantes;
    }
    
    public void mostrarLista(){
        for (CantanteFamoso cantFamoso : listaCantantes) {
            System.out.println("---");
            System.out.println(cantFamoso.toString());
        }
    }
    
    public void eliminar(String nombre){
        Iterator<CantanteFamoso> it = listaCantantes.iterator();
        while(it.hasNext()){
            if(it.next().getNombre().equals(nombre)){
                it.remove();
            }
        }
        System.out.println("Cantante eliminado de la Lista");
    }
    
    public void editar(String nombre){
        int opc = 0;
        for (CantanteFamoso cantFamoso : listaCantantes) {
            if(cantFamoso.getNombre().equals(nombre)){
                opc = menuEditar();
                switch(opc){
                    case 1: 
                            System.out.println("Nuevo Nombre:");
                            cantFamoso.setNombre(leer.next());
                            break;
                    case 2: 
                            System.out.println("Disco más Famoso:");
                            cantFamoso.setDiscoMasVendido(leer.next());
                            break;
                    default: System.out.println("Opcion invalida");
                             break;
                }
            }
        }
        if(opc == 0){
            System.out.println("El cantante no está en la lista");
        }
    }
    
    public int menuEditar(){
        int opc;
        System.out.println("Que desea editar:");
        System.out.println("1. Nombre:");
        System.out.println("2. Disco más Famoso:");
        opc = leer.nextInt();
        return opc;
    }
    
}
