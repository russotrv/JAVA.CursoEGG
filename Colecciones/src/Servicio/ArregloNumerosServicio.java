/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.ArregloNumeros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ArregloNumerosServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList listaNum = new ArrayList();
    
    public ArregloNumeros cargarLista(){
        int num;
        boolean cont = true;
        ArregloNumeros an = new ArregloNumeros();
        
        System.out.println("Ingrese numeros a la lista (-99 para salir)");
        do{
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            if(num != -99){
                listaNum.add(num);
            }else
                cont = false;
        }while(cont);
        
        an.setListaNumeros(listaNum);
        return an;
    }
}
