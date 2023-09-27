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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Charola");
        //Definicion de 6 variables de distinto tipo
        short num = -32768; //de -32768 a 32767
        int numero = 755938; // entero con signo de 32bits: de -2,147,483,648 a 2,147,483,64
        String nombre = "Juani Trovato"; //con "" 
        boolean bandera = true;
        byte edad = 29; //de -128 a 127
        float numReal = 535.89F; //decimal con precision simple 32 bits (IEEE754 Punto Flotante) 
        char caracter = '%'; //con ''
        //
        
        int suma = numero + edad;
        int resta = suma - 15821;
        boolean flag = suma > numReal;
        boolean banderita = resta != suma;
        int numero2 = numero;
        numero2++;
        float numero3 = -numero;
        /*
        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(banderita);
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años");
        System.out.println("Tu vieja es tu mama");
        */
        
        //Para leer datos de sistema creo leer desde la libreria Scanner
        Scanner leer = new Scanner(System.in);
        
        String nombreTeclado;
        System.out.println("Ingresa tu nombre:");
        nombreTeclado = leer.next();
        //para leer numeros: leer,nextT();
        //          leer.nextInt(); para valor entero 
        //          leer.nextDouble(); para reales
        //          leer.nextLine(); para cadenas
        System.out.println("El nombre ingresado por teclado es: " + nombreTeclado);
        
        boolean respuesta;
        System.out.println("Ingresa valor de bandera:");
        respuesta = leer.nextBoolean();
        System.out.println("Respuesta: " + respuesta); 
        
        double real;
        System.out.println("Ingresa un numero real:");
        real = leer.nextDouble() ;
        System.out.println("Real: " + real);
        
        char car;
        System.out.println("Ingresa un caracter");
        car = leer.next().charAt(0);
        System.out.println("Caracter: " + car);
        //Fin video 1 - Pagina 20
        
    }
    
}
