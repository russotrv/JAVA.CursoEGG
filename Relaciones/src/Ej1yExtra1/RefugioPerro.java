/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1yExtra1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class RefugioPerro {
    private ArrayList<Perro> listaPerros;
    private ArrayList<Persona> listaPersonas;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public RefugioPerro() {
        listaPerros = new ArrayList();
        listaPersonas = new ArrayList();
    }

    public ArrayList<Perro> getListaPerros() {
        return listaPerros;
    }

    public void setListaPerros(ArrayList<Perro> listaPerros) {
        this.listaPerros = listaPerros;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    public void llenarListaPerros(){
        listaPerros.add(new Perro("Simba", "Mestizo", "Mediano", 6));
        listaPerros.add(new Perro("Teo","Golden", "Grande", 9));
        listaPerros.add(new Perro("Firulais", "Salchicha", "Chico",3));
    }
    
    public void llenarListaPersonas(){
        Persona per1,per2,per3;
        per1 = new Persona("Juani", "Trovato", 29, 1111111);
        per2 = new Persona("Stephany", "Duran", 23, 222222);
        per3 = new Persona("Ivan", "Molero", 25, 3333333);
        
        listaPersonas.add(per1);
        listaPersonas.add(per2);
        listaPersonas.add(per3);
    }
    
    public void adoptar(){
        String nombrePerro;
        Collections.shuffle(listaPersonas);
        System.out.println("Listado de perritos: ");
        System.out.println(listaPerros.toString());
        System.out.println("------");
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println("Elija el nombre del perro a adoptar: ");
            nombrePerro = leer.next();
            if(buscarPerrito(nombrePerro) == false){
                System.out.println("Ingrese nombre de perro nuevamente: ");
                i--;
            }
        }
        System.out.println("Felicitaciones, cada persona tiene un perrito");
        System.out.println(listaPersonas.toString());
    }
    
    public boolean buscarPerrito(String nombre){
        for (int i = 0; i < listaPerros.size(); i++) {
            if(listaPerros.get(i).getNombre().equals(nombre)){
                if (listaPerros.get(i).getAdopcion()==false){    
                    listaPersonas.get(i).setPerro(listaPerros.get(i));
                    listaPerros.get(i).setAdopcion(true);
                    return true;
                }else{
                    System.out.println(nombre + " ya esta adoptado :(");
                    return false;
                }   
            }
        }
        System.out.println("No se encuentra el nombre en la lista");
        System.out.println("Ingrese el nombre nuevamente:");
        String nombrePerro = leer.next();
        return buscarPerrito(nombrePerro);        
    }
    
}
