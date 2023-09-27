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
public class primeraParte {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        /* 1.Escribir un programa que pida dos números enteros por teclado
        y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
        int num1, num2, res;
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        res = num1 + num2;
        System.out.println("La suma de los numeros ingresados es: " + res);
        */
        
        /* Escribir un programa que pida tu nombre,
        lo guarde en una variable y lo muestre por pantalla. 
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Su nombre es " + nombre);
        */
        
        /* 3. Escribir un programa que pida una frase
        y la muestre toda en mayúsculas y después toda en minúsculas. 
        Nota: investigar la función toUpperCase() y toLowerCase() en Java. 
        
        String frase;
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        System.out.println("La frase en mayusculas: " + frase.toUpperCase());
        System.out.println("La frase en minusculas: " + frase.toLowerCase());
        */
        
        /* 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
           Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). 
        double grados, fahrenheit;
        System.out.println("Ingrese sus grados centigrados:");
        grados = leer.nextDouble();
        fahrenheit = 32 + (9 * grados/5);
        System.out.println("Los grados ingresados en Fahrenheit: " + fahrenheit);
        */
        
        /* 5. Escribir un programa que lea un número entero por teclado
        y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
        Nota: investigar la función Math.sqrt(). 
        int numero;
        System.out.println("Ingrese un numero:");
        numero = leer.nextInt();
        System.out.println("Doble: " +numero*2);
        System.out.println("Trible: " + numero*3);
        System.out.println("Raiz cuadrada (round): " + Math.round(Math.sqrt(numero)));
        */
        
    }
}
