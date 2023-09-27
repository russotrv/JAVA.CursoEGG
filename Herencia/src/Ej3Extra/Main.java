/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3Extra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Main {
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
        • todos los alojamientos.
        • todos los hoteles de más caro a más barato.
        • todos los campings con restaurante
        • todos las residencias que tienen descuento.
    */
    public static void main (String[] args){
        boolean continuar = true;
        int opc;
        
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();
        
        Hotel4Estrellas h4 = new Hotel4Estrellas('s',"Costilla Crocante",50, 10, 15, 5, 4, "Hotel 4 Estrellas", "A pasitos de Santa Fe", "CABA", "Horace Larrata");
        Hotel5Estrellas h5 = new Hotel5Estrellas(3, 3, 5, 60, 'a', "Caviar y Vino", 15, 21, 7, 5, "Hotel 5 Estrellas", "Callao y Lopez", "CABA", "Jorde Macri");
        Camping c = new Camping(21, 10, true, true, 300d, "La Tranquera", "Calle 10 n 121", "Villa Gesell", "Flavio Azaro" );
        Residencia r = new Residencia(15, true, true, true, 500d, "Residencia Castañeiras", "Avenida Las Heras", "Olivos", "Alverbo Fernandez");
        
        listaAlojamientos.add(h4);
        listaAlojamientos.add(h5);
        listaAlojamientos.add(c);
        listaAlojamientos.add(r);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        
        while(continuar){
            opc = menu();
            switch(opc){
                case 1 : System.out.println("Mostrando todos los alojamientos:");
                          mostrarAlojamientos(listaAlojamientos);
                          break;
                         //No esta funcionando esa parte 
                case 2 : System.out.println("Mostrando hoteles en orden de precio descendente:");
                         mostrarHoteles(listaAlojamientos);
                         break;
                          
                case 3 : System.out.println("Mostrando todos los camping con restaurante");
                         mostrarCampingConResto(listaAlojamientos);
                         break;
                          
                case 4 : System.out.println("Mostrando todas las residencias con descuento a obras sociales");
                         mostrarResidenciaConDto(listaAlojamientos);
                         break;
                          
                case 5 : continuar = false;
                         break;
                         
                default : System.out.println("Opcion incorrecta");
                          break;
            }
        }
    }
    
    public static int menu(){
        int opc;
        System.out.println("Consulta de criterios:");
        System.out.println("1. Todos los alojamientos");
        System.out.println("2. Todos los hoteles (de mas caro a mas barato)");
        System.out.println("3. Todos los campings con restaurante");
        System.out.println("4. Todas las residencias con descuento");
        System.out.println("5. Salir");
        opc = leer.nextInt();
        return opc;
    }
    
    public static void mostrarAlojamientos(ArrayList<Alojamiento>listaAlojam){
        listaAlojam.forEach((alojamiento) -> {
            System.out.println(alojamiento.toString());
        });
    }
    
    public static void mostrarHoteles(ArrayList<Alojamiento>listaAlojam){
        ArrayList<Hoteles>listaHoteles = new ArrayList();
        
        for (Alojamiento alojamiento : listaAlojam) {
            if(alojamiento.getClass() == Hotel4Estrellas.class || alojamiento.getClass() == Hotel5Estrellas.class)
                listaHoteles.add((Hoteles)alojamiento);
        }
        listaHoteles.sort(Hoteles.compararPrecioDesc);
        for (Hoteles hotel : listaHoteles) {
            System.out.println(hotel.toString());
        }
        
        //Agregar comparator para ordenarlos por precio descendente
    }
    
    public static void mostrarCampingConResto(ArrayList<Alojamiento>listaAlojam){
        
        for (Alojamiento alojamiento : listaAlojam) {
            if(alojamiento.getClass() == Camping.class)
                if(((Camping)alojamiento).restaurant == true)
                    System.out.println(alojamiento.toString());
        }
    }
    
    public static void mostrarResidenciaConDto(ArrayList<Alojamiento>listaAlojam){
        for (Alojamiento alojamiento : listaAlojam) {
            if(alojamiento.getClass() == Residencia.class)
                if(((Residencia)alojamiento).dtoGremios == true)
                    System.out.println(alojamiento.toString());
        }
    }
}
