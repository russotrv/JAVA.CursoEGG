/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4Extra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Main {
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args){
        /*
        Imprimir toda la información de cada tipo de individuo.
        Incluya un programa de prueba que instancie objetos de los distintos tipos
        y pruebe los métodos desarrollados.
        */
        ArrayList<Persona> listaPersonasUniversidad = new ArrayList();
        Empleado empleado = new Empleado(2003, 8, "Luisa", "Perez", "Casada", 12453);
        Estudiante estudiante = new Estudiante("Full Stack Java", "Juan I", "Trovato Russo", "Soltero", 21815);
        Profesor profesor = new Profesor("Front End",2005, 13, "Claudio", "Rodriguez", "Divorciado", 13854);
        PersonalDeServicio servicio = new PersonalDeServicio("Segundo Piso", 2020, 0, "Roque", "Perez", "Casado", 8543);
        
        listaPersonasUniversidad.add(empleado);
        listaPersonasUniversidad.add(estudiante);
        listaPersonasUniversidad.add(profesor);
        listaPersonasUniversidad.add(servicio);
        
        int opc;
        boolean continuar = true;
        mostrarInfoPersonas(listaPersonasUniversidad);
        while(continuar){
            opc = menu();
            //Hasta aca funciona, queda agregar una busqueda de la persona en particular
            switch(opc){
                case 1: System.out.println("Ingrese nuevo estado civil de la persona");
                        String nuevoEstado = leer.next();
                        estudiante.cambiarEstadoCivil(nuevoEstado);
                        break;
                case 2: System.out.println("Ingrese nuevo despacho del empleado");
                        Integer nuevoDespacho = leer.nextInt();
                        profesor.cambiarNumeroDespacho(nuevoDespacho);
                        break;
                case 3: System.out.println("Ingrese nuevo departamento del profesor");
                        String nuevoDpto = leer.next();
                        profesor.cambiarDepartamento(nuevoDpto);
                        break;
                case 4: System.out.println("Ingrese curso al que se ha matriculado el alumno:");
                        String nuevoCurso = leer.next();
                        estudiante.agregarCursoMatriculado(nuevoCurso);
                        break;
                case 5: System.out.println("Ingrese seccion a la que se traslada al empleado de servicio:");
                        String nuevaSeccion = leer.next();
                        servicio.cambiarSeccionAsignada(nuevaSeccion);
                        break;
                case 6: continuar = false;
                        break;
                default: System.out.println("Opcion erronea");
                         break;
            }
            mostrarInfoPersonas(listaPersonasUniversidad);
        }
        
    }
    
    public static void mostrarInfoPersonas(ArrayList<Persona> listaPersonasUniversidad){
        System.out.println("Informacion de las personas de la Universidad");
        listaPersonasUniversidad.forEach((persona) -> {
            System.out.println(persona.toString());
        });
    }
    
    public static int menu(){
        int opc;
        System.out.println("Menu opciones:");
        System.out.println("1. Cambiar estado civil de persona:");
        System.out.println("2. Reasignar despacho de empleado");
        System.out.println("3. Cambiar departamento de profesor");
        System.out.println("4. Matriculacion de alumno a nuevo curso");
        System.out.println("5. Traslado de seccion de personal de servicio");
        System.out.println("6. Salir");
        opc = leer.nextInt();
        return opc;
    }
}
