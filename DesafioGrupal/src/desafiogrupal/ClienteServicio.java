/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogrupal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ClienteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList <Cliente> listaC = new ArrayList<>();
    private int id = 1;
    
    public void registrarCliente(){
        Cliente c = new Cliente();
        System.out.println("Ingrese informacion de cliente:");
        System.out.println("Nombre:");
        c.setNombre(leer.next());
        System.out.println("Edad:");
        c.setEdad(leer.nextInt());
        System.out.println("Altura:");
        c.setAltura(leer.nextDouble());
        System.out.println("Peso:");
        c.setPeso(leer.nextDouble());
        System.out.println("Objetivo:");
        c.setObjetivo(leer.next());
        c.setId(id);
        
        id++;
        listaC.add(c);
    }
    
    public ArrayList obtenerClientes(){
        return listaC;
    }
    
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo){
        int i = posicionCliente(id);
        
        listaC.get(i).setNombre(nombre);
        listaC.get(i).setEdad(edad);
        listaC.get(i).setPeso(peso);
        listaC.get(i).setAltura(altura);
        listaC.get(i).setObjetivo(objetivo);
    }
    
    public void eliminarCliente(int id){
        int i = posicionCliente(id);
        listaC.remove(i);
        System.out.println("Cliente eliminado de la lista!");
    }
    
    public int posicionCliente(int id){
        int posicion = -1;
        for (int i = 0; i < listaC.size(); i++) {
            if(listaC.get(i).getId() == id){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
}
