/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjExtra3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class PolizaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Poliza> listaPolizas;
    private ClienteServicio cs;   
    private PolizaServicio ps;

    public PolizaServicio() {
        listaPolizas = new ArrayList();
        cs = new ClienteServicio();
        ps = new PolizaServicio();
    }

    public ArrayList<Poliza> getListaPolizas() {
        return listaPolizas;
    }
       
    public void gestionDePoliza(){
        Poliza p = new Poliza();
        Cliente c ;
        
        System.out.println("Informacion de Poliza:");
        
        System.out.println("Numero:");
        p.setNumeroPoliza(leer.nextInt());
        
        System.out.println("Fecha de Inicio: ");
        p.setInicio(fecha());
        
        System.out.println("Fecha de fin: ");
        p.setFin(fecha());
        
        System.out.println("Forma de pago: ");
        p.setFormaPago(leer.next());
        
        System.out.println("Cantidad de cuotas: ");
        p.setCantCuotas(leer.nextInt());
        
        System.out.println("Tipo de cobertura: ");
        p.setTipoCobertura(leer.next());
        
        if(validacionGranizo()){
            p.setIncluyeGranizo(true);
            System.out.println("Monto maximo de granizo: ");
            p.setMontoMaximoGranizo(leer.nextDouble());
        }else
            p.setIncluyeGranizo(false);
        
        System.out.println("Monto total asegurado: ");
        p.setMontoTotalAsegurado(leer.nextDouble());
        
        c = cs.gestionIntegralDeCliente();
        p.setCliente(c);
        c.addListaPolizas(p);
        
        listaPolizas.add(p);
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
    
    private boolean validacionGranizo(){
        String granizo;
        boolean incluye = false;
        do{
            System.out.println("Incluye granizo (s/n)");
            granizo = leer.next();
        }while(!granizo.equals("s") && !granizo.equals("n"));
        
        if(granizo.equals("s"))
            incluye = true;
        
        return incluye;
    }
}
