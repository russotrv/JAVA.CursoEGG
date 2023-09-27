/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2Extra;

/**
 *
 * @author Juan
 */
public class EdificioDeOficinas extends Edificio {
    protected Integer numeroDeOficinas, cantPersonasOficina, numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numeroDeOficinas, Integer cantPersonasOficina, Integer numeroDePisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantPersonasOficina = cantPersonasOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public Integer getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(Integer numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public Integer getCantPersonasOficina() {
        return cantPersonasOficina;
    }

    public void setCantPersonasOficina(Integer cantPersonasOficina) {
        this.cantPersonasOficina = cantPersonasOficina;
    }

    public Integer getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(Integer numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }
    
    @Override
    public void calcularSuperficie(){
        System.out.println("Superficie del edificio de oficinas: " + super.getAncho()*super.getLargo()+"m2");
    }
    
    @Override
    public void calcularVolumen(){
        System.out.println("Volumen del edificio de oficinas: " + super.getAncho()*super.getLargo()*super.getAlto()+"m3");
    }

    public void cantPersonas(){
        Integer personasPiso =  cantPersonasOficina*numeroDeOficinas;
        System.out.println("Cantidad de oficinas: " + numeroDeOficinas);
        System.out.println("Numero de pisos: " + numeroDePisos);
        System.out.println("Cantidad de personas por piso: " + personasPiso);
        System.out.println("Cantidad de personas en todo el edificio: " +personasPiso * numeroDePisos);
    }
}
