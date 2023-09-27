/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Ej1.Animal;
import Ej1.Caballo;
import Ej1.Gato;
import Ej1.Perro;
import Ej2.Electrodomestico;
import Ej2.Lavadora;
import Ej2.Televisor;
import Ej4.Circulo;
import Ej4.Rectangulo;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ej1
        Animal perro = new Perro("Chachito", "Lo que sea", "Callejero", 6);
        perro.alimentarse();
        System.out.println("-----");
        Animal gato = new Gato("Michi", "Pollito y pescado", "Negro", 5);
        gato.alimentarse();
        System.out.println("-----");
        Caballo caballo = new Caballo("Runflas", "Faena wey", "Misto", 3);
        caballo.alimentarse();
        System.out.println("-----");
        */
        
        /*Ej2
        Lavadora l = new Lavadora();
        l.crearLavadora();
        l.precioFinal();
        l.mostrarLavadora();
        System.out.println("-----");
        System.out.println("");
        Televisor t = new Televisor();
        t.crearTelevisor();
        t.precioFinal();
        t.mostrarTelevisor();
        */
        
        /*Ej3
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();
        Lavadora l1,l2;
        Televisor t1,t2;
        Double precioTotal = 0d;
        Double precio;
        
        l1 = new Lavadora(35, 1000d, 50, "gris", 'd');
        l2 = new Lavadora(30, 1000d, 60, "negro", 'b');
        t1 = new Televisor(720, true, 1000d, 25, "negro", 'c');
        t2 = new Televisor(1080, false, 1000d, 30, "rojo", 'e');
        
        listaElectrodomesticos.add(l1);
        listaElectrodomesticos.add(l2);
        listaElectrodomesticos.add(t1);
        listaElectrodomesticos.add(t2);
        
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {
            listaElectrodomesticos.get(i).precioFinal();
            precio = listaElectrodomesticos.get(i).getPrecio();
            System.out.println("Precio "+i+": "+precio);
            precioTotal += precio;
        }
        System.out.println("El precio total de todos los electrodomesticos es: " + precioTotal);
        */
        
        /*Ej4
        Circulo c = new Circulo(10d);
        Rectangulo r = new Rectangulo(2d,3d);
        
        System.out.println("Perimetro y area de las figuras:");
        System.out.println("Circulo: ");
        System.out.println("Perimetro: " + c.calcularPerimetro());
        System.out.println("Area: " + c.calcularArea());
        System.out.println("---");
        System.out.println("Rectangulo: ");
        System.out.println("Perimetro: " + r.calcularPerimetro());
        System.out.println("Area: " + r.calcularArea());
        */
}
    
}
