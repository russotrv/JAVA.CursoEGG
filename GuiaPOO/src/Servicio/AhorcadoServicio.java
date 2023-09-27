/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Ahorcado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in);
    
    public void palabraArreglo(String[]arreglo, String palabra){
        for (int i = 0; i < palabra.length(); i++) {
            arreglo[i] = palabra.substring(i, i+1);
        }
    }
    
    public Ahorcado crearJuego(){
        Ahorcado a = new Ahorcado();
        String palabra;
        
        System.out.println("Ingrese la palabra:");
        palabra = leer.next();
        System.out.println("Cantidad de jugadas:");
        a.setJugadasMax(leer.nextInt());
        
        String[]arreglo = new String[palabra.length()];
        palabraArreglo(arreglo, palabra);
        a.setPalabraBuscar(arreglo);
        a.setLetrasEncontradas(0);
        
        return a;
    }
    
    public static void longitud(Ahorcado a){
        System.out.println("Longitud de la palabra: " + a.getPalabraBuscar().length+ " letras");
    }
    
    public static int buscar(Ahorcado a, String letra){
        int cant = 0, longitud = a.getPalabraBuscar().length;
        String[]palabra = a.getPalabraBuscar();
        for (int i = 0; i < longitud; i++) {
            if(palabra[i].equals(letra)){
                cant += 1;
            }
        }
        if(cant > 0){
            System.out.println("Letra encontrada en la palabra "+cant+" veces!");
        }
        return cant;
    }
    
    public static boolean encontradas(Ahorcado a, String letra){
        int cantEncontrada = buscar(a,letra);
        boolean encontrada = false;
        
        if(cantEncontrada >0){
            a.setLetrasEncontradas(a.getLetrasEncontradas()+cantEncontrada);
            encontrada = true;
        }
        System.out.println("Cantidad letras encontradas: " +a.getLetrasEncontradas());
        System.out.println("Quedan por encontrar: " +(a.getPalabraBuscar().length-a.getLetrasEncontradas()));
        
        return encontrada;
    }
    
    public static void inicializarEncontradas(String[]letrasEncontradas){
        for (int i = 0; i < letrasEncontradas.length; i++) {
            letrasEncontradas[i] = "_";
        }
    }
    
    public static void ubicarEncontrada(Ahorcado a, String letra, String[]letrasEncontradas){
        String[] palabra = a.getPalabraBuscar();
        for (int i = 0; i < palabra.length; i++) {
            if(palabra[i].equals(letra)){
                letrasEncontradas[i] = letra;
            }
        }
    }
    
    public static void mostrarEncontradas(String[] letrasEncontradas){
        for (int i = 0; i < letrasEncontradas.length; i++) {
            System.out.print(letrasEncontradas[i]+" ");
        }
        System.out.println("");
    }
    
    public static void intentos(int intento){
        System.out.println("Intentos restantes: "+intento);
    }
    
    public void juego(Ahorcado a){
        String letra;
        int jugadasMax = a.getJugadasMax();
        String[] letrasEncontradas = new String[a.getPalabraBuscar().length];
        ArrayList<String> letrasElegidas= new ArrayList<>();
        inicializarEncontradas(letrasEncontradas);
        
        System.out.println("Juego iniciado:");
        System.out.println("Tiene: "+jugadasMax+" intentos");
        
        longitud(a);
        
        for (int i = 1; i <= jugadasMax ; i++) {
            System.out.println("Ingrese una letra: ");
            letra = leer.next();
            letrasElegidas.add(letra);
            
            if (encontradas(a,letra)){
                ubicarEncontrada(a,letra,letrasEncontradas);
            }
            
            System.out.println("Letras encontradas:");
            mostrarEncontradas(letrasEncontradas);
            System.out.println("Letras elegidas: "+ letrasElegidas);
            
            intentos(jugadasMax-i);
            System.out.println("");
        }
        
        System.out.println("");
        if(a.getLetrasEncontradas() == a.getPalabraBuscar().length){
            System.out.println("Ganaste!"); 
        }else
            System.out.println("Perdiste");
        
        System.out.println("--------");
        System.out.println("Fin del juego");
    }
}
