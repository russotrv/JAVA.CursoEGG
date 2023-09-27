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
public class Mes {
    private ArrayList<String> listaMeses;
    private String mesSecreto;

    public Mes() {
    }

    public Mes(ArrayList<String> listaMeses, String mesSecreto) {
        this.listaMeses = listaMeses;
        this.mesSecreto = mesSecreto;
    }

    public void setListaMeses(ArrayList<String> listaMeses) {
        this.listaMeses = listaMeses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
    public ArrayList<String> getListaMeses() {
        return listaMeses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
 
}
