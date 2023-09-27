/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Mes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class MesServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private Mes crearMes(){
        Mes m = new Mes();
        int random;
        random = (int)(Math.random()*12);
        String[]meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        m.setListaMeses(new ArrayList<>(Arrays.asList(meses)));
        m.setMesSecreto(m.getListaMeses().get(random));
        
        return m;
    }
    
    public void jugar(){
        Mes m = crearMes();
        String mesAdivinar ="";
        String mesSecreto = m.getMesSecreto().toLowerCase();
        int intento = 0;
        
        do{
            System.out.println("Adivine el mes secreto: ");
            mesAdivinar = leer.next().toLowerCase();
            intento += 1;
            if(!mesAdivinar.equals(mesSecreto)){
                System.out.println("No acertaste! Intenta de nuevo.");
            }
        }while(!mesAdivinar.equals(mesSecreto) & intento <11);
        
        if(intento<11){
            System.out.println("Adivinaste! El mes secreto es: " + m.getMesSecreto());
        }else
            System.out.println("Perdiste.");
    }
}
