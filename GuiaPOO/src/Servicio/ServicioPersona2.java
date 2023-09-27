/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona2;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ServicioPersona2 {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona2 crearPersona(){
        Persona2 p = new Persona2();
        int anio,mes,dia;
        Date fecha = new Date();
        
        System.out.println("Ingrese el nombre de la persona:");
        p.setNombre(leer.next());
        System.out.println("Ingrese dia, mes y año de nacimiento:");
        dia = leer.nextInt(); mes = leer.nextInt()-1; anio = leer.nextInt()-1900;
        fecha.setDate(dia); fecha.setMonth(mes); fecha.setYear(anio);
        p.setFechaNacimiento(fecha);
        return p;
    }
    
    public int calcularEdad(Persona2 p){
       int anioNac = p.getFechaNacimiento().getYear();
       Date fechaActual = new Date();
       int anioAct = fechaActual.getYear();
       int edad = anioAct-anioNac;
       //System.out.println("La edad de la persona es: "+ edad);
       return edad;
    }
    
    public boolean menorQue(Persona2 p, int edad){
        return calcularEdad(p) < edad;
    }
    
    public void mostrarPersona(Persona2 p){
        System.out.println("Informacion de la persona: " + p.toString());
    }
}
