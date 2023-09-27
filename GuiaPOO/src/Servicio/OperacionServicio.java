/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidades.Operacion;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class OperacionServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
        Operacion op = new Operacion();
       
        System.out.println("Ingrese el primer numero");
        op.setNum1(leer.nextInt());
        
        System.out.println("Ingrese el segundo numero");
        op.setNum2(leer.nextInt());
        
        return op;
    }
    
    public int sumar(Operacion op){
        int resultado;
        resultado = op.getNum1() + op.getNum2();
        return resultado;
    }
    
    public int restar(Operacion op){
        int resultado;
        resultado = op.getNum1() - op.getNum2();
        return resultado;
    }
    
    public int multiplicacion(Operacion op){
        int resultado = 0;
        if (op.getNum1() == 0 || op.getNum2() == 0)
            System.out.println("Estas multiplicando por 0");
        else resultado = op.getNum1() * op.getNum2();
        return resultado;
    }
    
    public int division(Operacion op){
        int resultado = 0;
        if(op.getNum2()==0)
            System.out.println("Estas dividiendo por 0");
        else
            resultado = (int) (op.getNum1() / op.getNum2());
        return resultado;
    }
}
