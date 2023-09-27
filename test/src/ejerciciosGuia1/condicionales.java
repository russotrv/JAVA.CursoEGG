/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia1;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class condicionales {
    public static void main (String[] args){
    Scanner leer = new Scanner(System.in);    
    /* 6.Crear un programa que dado un numero determine si es par o impar. 
        int num;
        System.out.println("Ingrese un numero entero:");
        num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " es par");
        } else {
            System.out.println(num +" es impar");
        }
    */
    
    /* 7. Crear un programa que pida una frase y
    si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
    sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
        String frase;
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine().toLowerCase();
        if(frase.equals("eureka")){
            System.out.println("CORRECTO!");
        }else{
            System.out.println("INCORRECTO");
        }
    */
    
    /* 8. Realizar un programa que solo permita introducir frases o palabras de 8 car de largo.
    Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
    por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    Nota: investigar la función Lenght() en Java. 
        String frase8;
        System.out.println("Ingrese una frase corta!");
        frase8 = leer.nextLine();
        if(frase8.length() == 8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    */
    
    /* 9. Escriba un programa que pida una frase o palabra y valide la primera letra.
    Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla diga “CORRECTO”,
    en caso contrario, se deberá imprimir “INCORRECTO”.
    Nota:investigar la función Substring y equals() de Java. 
        String frase;
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        if ( frase.substring(0, 1).toLowerCase().equals("a") ){
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }
    */
    }
}
