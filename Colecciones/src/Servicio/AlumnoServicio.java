/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import colecciones.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class AlumnoServicio {
    ArrayList<Alumno> listaAlumnos = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarAlumnos(){
        int res;
        Alumno a = new Alumno();
        do{
            res = menuAlumnos();
            switch(res){
                case 1: infoAlumno(a); 
                        listaAlumnos.add(a);    
                        break;
                case 2: break;
            }
        }while(res != 2);
        System.out.println("Lista de alumnos cargada con exito!");
        System.out.println("-----");
    }
    
    private int menuAlumnos(){
        int res;
        System.out.println("1. Cargar alumno");
        System.out.println("2. Salir");
        res = leer.nextInt();
        return res;
    }
    
    private void infoAlumno(Alumno a){
        ArrayList<Double> listaNotas = new ArrayList();
        
        System.out.println("Nombre alumno:");
        a.setNombre(leer.next());
        
        System.out.println("Notas del alumno:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota "+ (i+1));
            listaNotas.add(leer.nextDouble());
        }
        
        a.setListaNotas(listaNotas);
        System.out.println("Alumno cargado con exito!");
        System.out.println("");
    }
    
    public int alumnoEnLista(String nombre){
        Iterator<Alumno> it = listaAlumnos.iterator();
        int pos=0;
        while(it.hasNext()){
            if(it.next().getNombre().equals(nombre)){
                return pos;
            }
            pos +=1;
        }
        return -1;
    }
    
    public double notaFinal(int pos){
        double notaF=0;
        ArrayList listaNotas = listaAlumnos.get(pos).getListaNotas();
        for (int i = 0; i < listaNotas.size(); i++) {
            notaF += (double) listaNotas.get(i);
        }
        return notaF/3;
    }
}
