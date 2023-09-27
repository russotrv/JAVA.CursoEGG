/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Juan
 */
public class Matematica {
    private double n1;
    private double n2;

    public Matematica() {
    }

    public Matematica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    //Setters
    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    //Getters
    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }
    
    
    
    //Metodos Internos
    public static double devolverMayor(Matematica m){
        return Math.max(m.getN1(), m.getN2());
    }
    
    public static double devolverMenor(Matematica m){
        return Math.min(m.getN1(), m.getN2());
    }
    
    public static double calcularPotencia(Matematica m){
        double mayor = Math.round(devolverMayor(m));
        double menor = Math.round(devolverMenor(m));
        return Math.pow(mayor, menor);
    }
    
    public static double calcularRaiz(Matematica m){
        double menor = Math.abs(devolverMenor(m));
        return Math.sqrt(menor);
    }
    
}
