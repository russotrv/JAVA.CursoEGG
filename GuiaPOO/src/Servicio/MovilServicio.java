/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class MovilServicio {
    Scanner leer = new Scanner(System.in);
    
    private void ingresarCodigo(int[]codigo){
        System.out.println("Ingrese los "+codigo.length+" digitos del codigo:");
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("["+i+"]:");
            codigo[i] = leer.nextInt();
        }
    }
    
    public Movil cargarCelular(){
        Movil m = new Movil();
        int[]codigo = new int[7];
        
        System.out.println("Ingrese marca del movil:");
        m.setMarca(leer.next());
        System.out.println("Modelo");
        m.setModelo(leer.next());
        System.out.println("Precio:");
        m.setPrecio(leer.nextDouble());
        System.out.println("Capacidad de RAM:");
        m.setRam(leer.nextInt());
        System.out.println("Capacidad de almacenamiento:");
        m.setAlmacenamiento(leer.nextInt());
        ingresarCodigo(codigo);
        m.setCodigo(codigo);
        
        return m;
    }
    
    public void mostrarInfoCelular(Movil m){
        System.out.println("Informacion del movil:");
        System.out.println("Marca: "+m.getMarca());
        System.out.println("Modelo: "+m.getModelo());
        System.out.println("Precio: "+ m.getPrecio());
        System.out.println("RAM: "+m.getRam()+"GB");
        System.out.println("Almacenamiento: "+m.getAlmacenamiento()+"GB");
        System.out.println("Codigo:");
        for (int i = 0; i < m.getCodigo().length; i++) {
            System.out.print(m.getCodigo()[i]);
        }
    }
}
