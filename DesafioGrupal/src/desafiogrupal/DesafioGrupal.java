/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiogrupal;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class DesafioGrupal {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        ClienteServicio cs = new ClienteServicio();
        RutinaServicio rs = new RutinaServicio();
        Rutina r;
        Cliente c;
        
        int cantClientes, cantRutinas;
        
        System.out.println("Cuantos clientes desea ingresar a la lista?:");
        cantClientes = leer.nextInt();
        
        for (int i = 0; i < cantClientes; i++) {
            cs.registrarCliente();
        }
                
        System.out.println("---------");
        
        System.out.println("Lista de Clientes:");
        System.out.println(cs.obtenerClientes());
        
        System.out.println("---------");
        System.out.println("Cuantas rutinas quiere registrar en la lista?:");
        cantRutinas = leer.nextInt();
        
        for (int i = 0; i < cantRutinas; i++) {
            r = crearRutina();
            rs.agregarRutina(r);
        }

        System.out.println("---------");
        
        System.out.println("Lista de Rutinas: ");
        System.out.println(rs.obtenerRutinas());
        
        System.out.println("---------");
        
        c = modificarCliente();
        cs.actualizarCliente(c.getId(), c.getNombre(), c.getEdad() ,c.getAltura(), c.getPeso(), c.getObjetivo());
        System.out.println("Lista de clientes actualizada: \n"+cs.obtenerClientes());
        
        r = modificarRutina();
        rs.actualizarRutina(r.getId(), r.getNombre(), r.getDuracion(), r.getNivelDificultad(), r.getDescripcion());
        System.out.println("Lista de rutinas actualizada: \n " +rs.obtenerRutinas());
        
        System.out.println("Ingrese el ID del cliente a eliminar de la lista:");
        cs.eliminarCliente(leer.nextInt());
        System.out.println("\nLista de clientes actualizada: \n"+cs.obtenerClientes());
        
        System.out.println("Ingrese el ID de la rutina a eliminar de la lista:");
        rs.eliminarRutina(leer.nextInt());
        System.out.println("\nLista de rutinas actualizada: \n " +rs.obtenerRutinas());
    }
    
    
    public static Rutina crearRutina(){
        Rutina r = new Rutina();
       
        System.out.println("Ingrese datos de la rutina:");
        
        System.out.println("Nombre:");
        r.setNombre(leer.next());
        System.out.println("Duracion:");
        r.setDuracion(leer.nextInt());
        System.out.println("Nivel dificultad");
        r.setNivelDificultad(leer.next());
        System.out.println("Descripcion:");
        r.setDescripcion(leer.next());
        
        return r;
    }
    
    public static Cliente modificarCliente(){
        Cliente c = new Cliente();
        System.out.println("ID del cliente a buscar: ");
        c.setId(leer.nextInt());
        System.out.println("Datos modificados:");
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
       
        return c;
    }
    
    public static Rutina modificarRutina(){
        Rutina r = new Rutina();
        System.out.println("ID de la rutina a buscar:");
        r.setId(leer.nextInt());
        System.out.println("Ingrese datos modificados:");
        System.out.println("Nombre:");
        r.setNombre(leer.next());
        System.out.println("Duracion:");
        r.setDuracion(leer.nextInt());
        System.out.println("Nivel dificultad");
        r.setNivelDificultad(leer.next());
        System.out.println("Descripcion:");
        r.setDescripcion(leer.next());
        
        return r;
    }
    
}
