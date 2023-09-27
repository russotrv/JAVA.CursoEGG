/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import Ej2.DivisionNumero;
import Ej2.EjemploArray;
import Ej5.NumeroAleatorio;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Juan
 */
public class Excepciones {
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ej2
        Integer[] listaN = {1,2,3,4,5,6,7,8};
        EjemploArray eA = new EjemploArray();
        try{
            eA.cargarListaNum(listaN);
            eA.mostrarLista();
        }catch(Exception e){
            System.out.println("Arreglo fuera de rango");
        }
        */
        
        /*Ej3
        DivisionNumero dn = new DivisionNumero();
        Scanner leer = new Scanner(System.in);
        String numA, numB;
        int numAA, numBB;
        System.out.println("Ingrese dos numeros:");
        numA = leer. next(); numB = leer.next();
        numAA = Integer.parseInt(numA);
        numBB = Integer.parseInt(numB);
        
        try{
            System.out.println(dn.division(numAA, numBB));
        }catch(ArithmeticException ae){
            System.out.println("No se puede dividir por cero");
        }catch(NumberFormatException nfe){
            System.out.println("No ingresaste un numero");
        }
        */
        
        /*Ej5
        NumeroAleatorio na = new NumeroAleatorio();
        int intento = 0;
        int numAdivinado=-1;
        System.out.println("Intenta adivinar el numero entero aleatorio (entre 0y20)");
        do{
            try{
                System.out.println("Intento " + intento);
                System.out.println("Numero:");
                numAdivinado = leer.nextInt();
                intento ++;
            }catch(InputMismatchException e){
                System.out.println("No se ingreso un numero entero");
                intento++;
                break;
            }
        }while(numAdivinado != na.getAleatorio());
        System.out.println("Cantidad de intentos: " + intento);
        */
      
        
    }
    
}
