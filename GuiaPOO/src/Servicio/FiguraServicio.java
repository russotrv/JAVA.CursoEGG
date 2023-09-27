/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Figura;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class FiguraServicio {
    Scanner leer = new Scanner(System.in);

    public Figura crearFigura(){
        Figura f = new Figura();
        System.out.println("Escriba el tipo de figura:");
        f.setTipo(leer.next());
        return f;
    }
    
    public double Perimetro(Figura f){
        double per = 0;
        String tipo = f.getTipo();
        switch(tipo){
            case "cuadrado":
                            double ladoCuad;
                            System.out.println("Dimension del lado:");
                            ladoCuad = leer.nextDouble();
                            per = 4 * ladoCuad;
                            break;
            case "rectangulo":
                            double baseRec, alturaRec;
                            System.out.println("Base y altura:");
                            baseRec = leer.nextDouble();
                            alturaRec = leer.nextDouble();
                            per = 2 * baseRec + 2 * alturaRec;
                            break;
            case "triangulo":
                            double lado1, lado2, lado3;
                            System.out.println("Dimension de los lados del triangulo:");
                            lado1 = leer.nextDouble();
                            lado2 = leer.nextDouble();
                            lado3 = leer.nextDouble();
                            per = lado1 + lado2 + lado3; 
                            break;
            case "circulo":
                            double radio;
                            System.out.println("Radio:");
                            radio = leer.nextDouble();
                            per = Math.PI * 2 * radio;
                            break;
            case "hexagono":
                            double ladoHex;
                            for (int i = 0; i < 6; i++) {
                                System.out.println("Lado "+(i+1));
                                ladoHex = leer.nextDouble();
                                per += ladoHex;
                            }
                            break;
            case "pentagono":
                            double ladoPen;
                            for (int i = 0; i < 5; i++) {
                                System.out.println("Lado "+(i+1));
                                ladoPen = leer.nextDouble();
                                per += ladoPen;
                            }
                            break;
            case "rombo":
                          double ladoRom;
                          System.out.println("Dimension del lado");
                          ladoRom = leer.nextDouble();
                          per = ladoRom * 4;
                          break;
        }
        return per;
    }
    
    public double Area(Figura f){
        String tipo = f.getTipo();
        double area = 0;
        switch(tipo){
            case "cuadrado":
                            double ladoCuad;
                            System.out.println("Dimension del lado:");
                            ladoCuad = leer.nextDouble();
                            area = ladoCuad * ladoCuad;
                            break;
            case "rectangulo":
                            double baseRec, alturaRec;
                            System.out.println("Base y altura:");
                            baseRec = leer.nextDouble();
                            alturaRec = leer.nextDouble();
                            area =  baseRec * alturaRec;
                            break;
            case "triangulo":
                            double baseT, alturaT;
                            System.out.println("Base y altura:");
                            baseT = leer.nextDouble();
                            alturaT = leer.nextDouble();
                            area = (baseT * alturaT)/2; 
                            break;
            case "circulo":
                            double radio;
                            System.out.println("Radio:");
                            radio = leer.nextDouble();
                            area = Math.PI * Math.pow(radio,2);
                            break;
            case "hexagono":
                            double apotemaHex;
                            System.out.println("Apotema: ");
                            apotemaHex = leer.nextDouble();
                            area = (Perimetro(f) * apotemaHex)/2;
                            break;
            case "pentagono":
                            double apotemaPent;
                                System.out.println("Apotema: ");
                                apotemaPent = leer.nextDouble();
                                area = (Perimetro(f) * apotemaPent)/2;
                            break;
            case "rombo":
                          double diagMen, diagMay;
                          System.out.println("Diagonal menor y mayor: ");
                          diagMen = leer.nextDouble();
                          diagMay = leer.nextDouble();
                          area = (diagMen * diagMay)/2;
                          break;
        }
        return area;
    }
    
}
