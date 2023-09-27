/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class TaskManager {
    public ArrayList<String> listaTareas = new ArrayList<>();

    public TaskManager() {
    }
    
    public void agregarTarea(String tarea){
        listaTareas.add(tarea);
        System.out.println("Tarea agregada a la lista");
        mostrarTareas();
    }
    
    private void mostrarTareas(){
        System.out.println("Lista de tareas");
        System.out.println(listaTareas);
    }
    
    public void eliminarTarea(String tarea){
        listaTareas.remove(tarea);
        System.out.println("Tarea eliminada de la lista");
        mostrarTareas();
    }
     
    
    
    
}
