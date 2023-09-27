/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class arreglosYprocFunc {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        /*
        String[] equipo = new String[8];
        
        System.out.println("Ingrese los nombres de los miembros del equipo");
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("miembro["+i+"]");
            equipo[i] = leer.nextLine();
        }
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("miembro["+i+"]: " +equipo[i]+" ");
        }
        */
        /*11
        String cadena;
        System.out.println("Ingrese una cadena:");
        cadena = leer.nextLine();
        //System.out.println(cadena);
        String cadenaNueva = cambiarChar(cadena);
        System.out.println("cadena modificada: " +cadenaNueva);
        */
        /*12
        int num1;
        int num2;
        System.out.println("Ingrese dos numeros enteros para ver si son multiplos:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        boolean res = esMultiplo(num1,num2);
        System.out.println(num1 + " es multiplo de " + num2 + ": " + res);
        */
       }
    
    public static String cambiarChar(String cadena){
        int longitud = cadena.length();
        String cadenaNueva = "";
        //System.out.println(longitud);
        String letra;
        for (int i = 0; i < longitud; i++) {
            letra = cadena.substring(i,i+1);
            switch(letra){
                case "a":
                        cadenaNueva += "@";
                        break;
                case "e":
                        cadenaNueva += "#";
                        break;
                case "i":
                        cadenaNueva += "$";
                        break;
                case "o":
                        cadenaNueva +=  "%";
                        break;
                case "u":
                        cadenaNueva += "*";
                        break;
                default:
                        cadenaNueva += letra;
            }
          
        }
        return cadenaNueva;
    }
    
    
    
    public static boolean esMultiplo(int num1, int num2){
        return num1 % num2 == 0;
    }
    
    
    
}