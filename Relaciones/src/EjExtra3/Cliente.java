/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjExtra3;

import java.util.ArrayList;
/**
 *
 * @author Juan
 */
public class Cliente {
    //Nombre y apellido, documento, mail, domicilio, teléfono
    private String nombre, apellido, mail, domicilio, telefono, documento;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Poliza> listaPolizas;

    public Cliente() {
        listaVehiculos = new ArrayList();
        listaPolizas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void addListaVehiculos(Vehiculo vehiculo) {
        this.listaVehiculos.add(vehiculo);
    }

    public ArrayList<Poliza> getListaPolizas() {
        return listaPolizas;
    }

    public void addListaPolizas(Poliza poliza) {
        this.listaPolizas.add(poliza);
    }    
    
    @Override
    public String toString() {
        return "Cliente{\n" + "Nombre: " + nombre + "\nApellido: " + apellido + "\nMail: " + mail + "\nDomicilio: " + domicilio + "\nTelefono: " + telefono + "\nDocumento: " + documento + "\n}";
    }
    
}
