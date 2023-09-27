/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioherencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Familia {
    /*
    Dirección
    IDE
    N° de lote
    Barrio
    Localidad
    */
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String direccion, localidad, barrio;
    protected Integer IDE, numLote;
    protected boolean tieneFactoresDeRiesgo;
    protected ArrayList<Integrante> listaIntegrantes;
    protected ArrayList<Integer> listaFactoresRiesgo;
    
    public Familia() {
    }

    public Familia(String direccion, String localidad, String barrio, Integer IDE, Integer numLote, boolean tieneFactoresDeRiesgo) {
        this.direccion = direccion;
        this.localidad = localidad;
        this.barrio = barrio;
        this.IDE = IDE;
        this.numLote = numLote;
        this.tieneFactoresDeRiesgo = tieneFactoresDeRiesgo;
        if(this.tieneFactoresDeRiesgo)
            cargarFactoresRiesgo();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Integer getIDE() {
        return IDE;
    }

    public void setIDE(Integer IDE) {
        this.IDE = IDE;
    }

    public Integer getNumLote() {
        return numLote;
    }

    public void setNumLote(Integer numLote) {
        this.numLote = numLote;
    }
    
    public final void cargarFactoresRiesgo(){
        boolean continuar = true;
        int numFactor;
        String res;
        System.out.println("Lista de Factores de riesgo:");
        for (FactoresRiesgo factores : FactoresRiesgo.values()) {
            System.out.println(factores.name());
        }
        System.out.println("Cargar un factor de riesgo");
        while(continuar){
            System.out.println("Ingrese el numero del factor de riesgo");
            numFactor = leer.nextInt();
            this.listaFactoresRiesgo.add(numFactor);
            System.out.println("Cargar otro?");
            res = leer.next().toLowerCase();
            continuar = res.equals("s");
        }
    }
    
    public void mostrarCantFactoresRiesgo(){
        System.out.println("La familia tiene: " + listaFactoresRiesgo.size()+ " factores de riesgo");
    }
    
    public void cargarIntegrante(Integrante integrante){
        listaIntegrantes.add(integrante);
    }
}
