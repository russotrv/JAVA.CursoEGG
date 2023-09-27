/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjExtra3;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class CuotasServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    public Cuotas gestionDeCuotas(){
        Cuotas c = new Cuotas();
        System.out.println("Informacion de las cuotas de la poliza: ");
        
        System.out.println("Numero de cuota: ");
        c.setNumeroCuota(leer.nextInt());
        
        System.out.println("Forma de pago (efectivo/transferencia/...): ");
        c.setFormaPago(leer.next());
        
        System.out.println("Fecha de vencimiento: ");
        c.setFechaVencimiento(fecha());
        
        System.out.println("Monto total de cuota: ");
        c.setMontoTotalCuota(leer.nextDouble());
        
        c.setCuotaPaga(validacionCuota());
        
        return c;
    }    
    
    private Date fecha(){
        Date f;
        int dia, mes, anio;
        
        System.out.println("Dia: ");
        dia = leer.nextInt();
        System.out.println("Mes: ");
        mes = leer.nextInt();
        System.out.println("Año: ");
        anio = leer.nextInt();
        
        f = new Date(dia,mes,anio);
        return f;
    }
    
        private boolean validacionCuota(){
        String granizo;
        boolean paga = false;
        do{
            System.out.println("Cuota pagada (s/n)");
            granizo = leer.next();
        }while(!granizo.equals("s") && !granizo.equals("n"));
        
        if(granizo.equals("s"))
            paga = true;
        
        return paga;
    }
    
}
