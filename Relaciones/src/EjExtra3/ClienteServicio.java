/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjExtra3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ClienteServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Cliente> listaClientes;
    private VehiculoServicio vs;

    public ClienteServicio() {
        listaClientes = new ArrayList();
        vs = new VehiculoServicio();
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
            
    public Cliente gestionIntegralDeCliente(){
        Cliente c = new Cliente();
        System.out.println("Ingrese informacion del cliente:");
        
        System.out.println("Nombre: ");
        c.setNombre(leer.next());
        
        System.out.println("Apellido: ");
        c.setApellido(leer.next());
        
        System.out.println("Documento: ");
        c.setDocumento(leer.next());
        
        System.out.println("Mail: ");
        c.setMail(leer.next());
        
        System.out.println("Domicilio: ");
        c.setDomicilio(leer.next());
        
        System.out.println("Telefono");
        c.setTelefono(leer.next());
        
        c.addListaVehiculos(vs.gestionDeVehiculos());
        
        listaClientes.add(c);
        
        return c;
    }    
    
}
