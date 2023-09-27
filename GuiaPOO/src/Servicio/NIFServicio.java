/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNIF(){
        NIF n = new NIF();
        
        System.out.println("DNI:");
        n.setDNI(leer.nextLong());
        
        n.setLetra(obtenerNIF(n.getDNI()));
        
        return n;
    }
    
    public char obtenerNIF(long num){
        char nif;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = (int) (num % 23);
        //System.out.println(resto);
        nif = letras[resto];
        return nif;
    }
    
    public void mostrarNIF(NIF n){
        //(ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F)
        long dni = n.getDNI();
        char nif = n.getLetra();
        int dig;
        String numStr=""+dni;
        System.out.println("NIF: ");
        System.out.print("00");
        for (int i = 0; i < 6; i++) {
            System.out.print(numStr.substring(i,i+1));
        }
        System.out.print("-"+nif);
        System.out.println("");
    }
}
