/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1Extra;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class mainEj1Extra {
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args){
        Alquiler alquiler;
        //Se carga la info del alquiler:
        alquiler = new Alquiler("Juani Trovato", 38017240, 21, new Date(2023,8,27), new Date(2023,9,12));
        //Luego la info del barco en el alquiler:
        cargarBarco(alquiler);
        System.out.println("Precio de alquiler: " + alquiler.precio());
        System.out.println("Info del alquiler: ");
        System.out.println(alquiler.toString());
    }

    public static void cargarBarco(Alquiler alquiler){
        String matricula; 
        Double eslora;
        Integer anioDeFabricacion;
        
        Integer numMastiles;
        Integer potenciaCV;
        Integer cantCamarotes;
        
        System.out.println("Informacion del barco a alquilar:");
        System.out.println("Matricula");
        matricula = leer.next();
        System.out.println("Eslora (en metros):");
        eslora = leer.nextDouble();
        System.out.println("Año de fabricacion:");
        anioDeFabricacion = leer.nextInt();
        
        System.out.println("Tipo de barco:");
        System.out.println("1. Velero");
        System.out.println("2. Barco de Motor");
        System.out.println("3. Yate");
        int num = leer.nextInt();
        
        Velero velero;
        BarcoDeMotor barcoMotor;
        Yate yate;
        
        switch(num){
            case 1: System.out.println("Numero de mastiles:");
                    numMastiles = leer.nextInt();
                    velero = new Velero(numMastiles, matricula, eslora, anioDeFabricacion);
                    alquiler.setBarcoOcupado(velero);
                    break;
                    
            case 2: System.out.println("Potencia (en CV):");
                    potenciaCV = leer.nextInt();
                    barcoMotor = new BarcoDeMotor(potenciaCV, matricula, eslora, anioDeFabricacion);
                    alquiler.setBarcoOcupado(barcoMotor);
                    break;
                    
            case 3: System.out.println("Potencia (en CV):");
                    potenciaCV = leer.nextInt();
                    System.out.println("Cantidad de camarotes: ");
                    cantCamarotes = leer.nextInt();
                    yate = new Yate(cantCamarotes, potenciaCV, matricula, eslora, anioDeFabricacion);
                    alquiler.setBarcoOcupado(yate);
                    break;
                    
            default:System.out.println("Opcion erronea");
                    break;
        }
        
    }
    
}
