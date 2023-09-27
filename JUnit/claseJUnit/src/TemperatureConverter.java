/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Juan
 */
public class TemperatureConverter {

    public TemperatureConverter() {
    }
    
    public double farToCelsius(double far){
        return (far-32) / (9.0/5.0);
    }
    
    public double celToFar(double cel){
        return (cel * (9.0/5.0)) + 32;
    }
    
    public double farToKel(double far){
        return  (5.0/9.0) * (far - 32.0) + 273.15;
    }
    
    public double kelToFar(double kel){
        return ((9.0/5.0) * (kel - 273.15)) + 32.0;
    }
    
    public double celToKel(double cel){
        return cel + 273.15;
    }
    
    public double kelToCel(double kel){
        return kel - 273.15;
    }
}
