/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.Persona;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersonaHC(String nombre, int edad, String sexo, double peso, double altura){
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public Persona crearPersona(){
        Persona p = new Persona();
        System.out.println("Ingrese los datos de la persona:");
        
        System.out.println("Nombre:");
        p.setNombre(leer.next());
        
        System.out.println("Edad:");
        p.setEdad(leer.nextInt());
        
        String sex="";
        do{
            System.out.println("Sexo (H/M/X):");
            sex = leer.next().toLowerCase();
        }while(!sex.equals("m") && !sex.equals("h") && !sex.equals("x"));
        p.setSexo(sex);
        
        System.out.println("Peso");
        p.setPeso(leer.nextDouble());
        
        System.out.println("Altura");
        p.setAltura(leer.nextDouble());
        
        return p;
    }
    
    public int calcularIMC(Persona p){
        int res;
        double imc;
        
        imc = p.getPeso()/( Math.pow(p.getAltura(), 2) );
        //<20: debajo del peso ideal -> -1
        //20-25: peso ideal -> 0
        //>25: sobrepeso -> 1
        
        if(imc < 20){
            res = -1;
        }else{
            if(imc >= 20 && imc <= 25){
                res = 0;
            }else
                res = 1;
        }
        
        return res;
    }
    
    public boolean esMayordeEdad(Persona p){
        int mayoriaEdad = 18;
        return p.getEdad() >= mayoriaEdad;
    }
    
}
