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
public class condicionales {
     public static void main(String[] args){
         Scanner leer = new Scanner(System.in);
         
        /* 
        //pido dos enteros y verifico si alguno es mayor a 25
         int num1;
         int num2;
         System.out.println("Ingrese dos numeros enteros:");
         num1 = leer.nextInt();
         num2 = leer.nextInt();
         
         //IF - ELSE
         
         if (num1 > 25 && num2 > 25){
             System.out.println("Los dos numeros son mayores a 25");
         } else if(num1 > 25){
             System.out.println("El numero " + num1 + " es mayor a 25");
         } else if(num2 > 25){
             System.out.println("El numero " + num2 + " es mayor a 25");
         }else{
             System.out.println("Ninguno de los numeros es mayor a 25");
         }
        */
     
        //switch
        // programita para bombas para fluidos:
        //casos: 1-agua; 2-gasolina; 3-hormigon; 4-pasta alimenticia; else-error
        /*
        short bomba; 
        System.out.println("Ingrese el tipo de bomba(1-4)");
        bomba = leer.nextShort();
        switch (bomba){
            case 1:
                   System.out.println("La bomba es una bomba de agua");
                   break;
            case 2:
                   System.out.println("La bomba es una bomba de gasolina");
                   break;
            case 3:
                   System.out.println("La bomba es una bomba de hormigon");
                   break;
            case 4:
                   System.out.println("La bomba es una bomba de pasta alimenticia");
                   break;
            default:
                   System.out.println("No existe un valor válido para tipo de bomba");
        }
        */
        /*
        short nota;
        System.out.println("Ingrese la nota obtenida por le alumne:");
        nota = leer.nextShort();            
        while(nota <= 0 || nota > 10){
            System.out.println("Ingrese la nota obtenida por le alumne:");
            nota = leer.nextShort();
        }
         System.out.println("Nota ingresada correctamente");
         */
        /*
        //Programa que lea 20 num: se sale si lee 0 y lo avisa
        //suma todos los positivos que se ingresen
        short cantidad = 0;
        short num;
        short suma = 0;
        do{
            System.out.println("Ingrese un numero positivo para sumar:");
            num = leer.nextShort();
            if (num == 0) {
                System.out.println("Numero 0 capturado!");
                break;
            } else if(num>0){
                    suma += num;
                }
            cantidad +=1;
        } while(cantidad < 20);
         System.out.println("Fin de ingreso de numeros!");
         System.out.println("Suma realizada: " + suma);
        */ 
        
        /*
        //Leer 4 numeros e imprimir el numero con la misma cantidad de asteriscos
         int num;
         int cant = 4;
         System.out.println("Ingrese " + cant + " numeros:");
         for (int i = 0; i < cant; i++) {
             num = leer.nextInt();
             System.out.print(num + " ");
             for (int j = 0; j < num; j++) {
                 System.out.print("*");
             }
             System.out.println("");
         }
        */
         String cadena;
         System.out.println("Ingrese una cadena:");
         cadena = leer.next();
         System.out.println(cadena);
         cambioCar(cadena);
         System.out.println(cadena);
         
        
     }
     
     
     
     
     public static String cambioCar (String cadena){
         int longitud = cadena.length();
         String letra; 
         for(int i = 0; i<longitud; i++){
             letra = cadena.substring(i,i);
             switch(letra){
                 case "a": letra = "@";
                 case "e": letra = "#";
                 case "i": letra = "$";
                 case "o": letra = "%";
                 case "u": letra = "*";
             }
        
         }
         return cadena;
         
     }
}
