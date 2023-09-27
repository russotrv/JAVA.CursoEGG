/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogrupal;

import java.util.ArrayList;
import java.util.Scanner;
/*
   id, duracion;
    nombre, nivelDificultad, descripcion;
*/
/**
 *
 * @author Juan
 */
public class RutinaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Rutina> listaR = new ArrayList<>();
    private int id = 1;
    
    public void agregarRutina(Rutina r){
        r.setId(id);
        listaR.add(r);
        id++;
    }
    
    public ArrayList obtenerRutinas(){
        return listaR;
    }
    
    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion){
        int i = posicionRutina(id);
        
        listaR.get(i).setNombre(nombre);
        listaR.get(i).setDuracion(duracion);
        listaR.get(i).setNivelDificultad(nivelDificultad);
        listaR.get(i).setDescripcion(descripcion);
    }
    
    public void eliminarRutina(int id){
        int i = posicionRutina(id);
        
        listaR.remove(i);
        System.out.println("Rutina eliminada de la lista!");
    }
    
    public int posicionRutina(int id){
        int posicion = -1;
        for (int i = 0; i < listaR.size(); i++) {
            if(listaR.get(i).getId() == id){
                posicion = i;
            }
        }
        return posicion;
    }
}
