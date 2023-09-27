/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarAlumnos(String[]alumnos){
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Nombre alumno["+i+"]:");
            alumnos[i] = leer.next();
        }
    }
        
    public Curso crearCurso(){
        Curso c = new Curso();
        String[] alumnos = new String[5];
        
        System.out.println("Nombre del curso:");
        c.setNombreCurso(leer.next());
        
        int hora;
        do{    
            System.out.println("Horas por dia:");
            hora = leer.nextInt();
        }while(hora <0 && hora >10);
        c.setCantidadHorasPorDia(hora);
        
        int dia;
        do{    
            System.out.println("Dias por semana:");
            dia = leer.nextInt();
        }while(dia <0 && dia>=7);
        c.setCantidadDiasPorSemana(dia);
        
        String turno;
        do{
            System.out.println("Turno (maniana/tarde):");
            turno = leer.next().toLowerCase();
        }while (!turno.equals("maniana") && !turno.equals("tarde"));
        c.setTurno(turno);
        
        double precio;
        do{
            System.out.println("Precio (hora):");
            precio = leer.nextDouble();
        }while(precio <0);
        c.setPrecioPorHora(precio);
        
        cargarAlumnos(alumnos);
        c.setAlumnos(alumnos);
        
        return c;
    }   
    
    public double calcularGananciaSemana(Curso c){
        return c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getCantidadDiasPorSemana() * c.getAlumnos().length ;
    }
    
}
