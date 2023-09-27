/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.Cuenta;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese los datos de su cuenta:");
        
        System.out.println("Numero de cuenta:");
        cuenta.setNumeroCuenta(leer.nextInt());
        
        System.out.println("DNI:");
        cuenta.setDni(leer.nextLong());
        
        System.out.println("Saldo actual:");
        cuenta.setSaldoActual(leer.nextInt());
        
        return cuenta;
    }
    
    public void ingresar(Cuenta c, double dinero){
        c.setSaldoActual(c.getSaldoActual()+(int)dinero);
    }
    
    public void retirar(Cuenta c, double retiro){
        int saldoAct = c.getSaldoActual();
        if(retiro >= saldoAct){
            System.out.println("\nNo tiene suficientes fondos, se retiran: "+saldoAct);
            c.setSaldoActual(0);
        }else{
            System.out.println("\nRetiro exitoso!");
            c.setSaldoActual(saldoAct - (int)retiro);
        }        
    }

    public void extraccionRapida(Cuenta c){
        int saldoAct = c.getSaldoActual();
        int retiro;
        do{ System.out.println("\nExtraccion rapida.\nSolo puede retirar hasta 20% de su saldo");
            System.out.println("Cuanto quiere retirar?");
            retiro = leer.nextInt();
        }while(retiro > saldoAct*0.2);
        c.setSaldoActual(c.getSaldoActual()-retiro);
    }
    
    public void consultarSaldo(Cuenta c){
        System.out.println("\nSaldo actual: "+c.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta c){
        System.out.println("\nDatos de la cuenta:");
        System.out.println("DNI:"+ c.getDni());
        System.out.println("Numero de cuenta: "+ c.getNumeroCuenta());
        consultarSaldo(c);
    }
}   

