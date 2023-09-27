/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioherencia;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class ResumenFamilia {
    /*
    Cantidad de personas
    Sexo
    Edad (Separar segun el siguiente orden, menores a un año, de un año, 2-5 años,
    6 años, 7 a 10, 11 a 20, 21 a 30, 31 a 60, +65años)
    Resumen de problemas de salud (cuantas personas hay, y que es lo que tienen)
    Resumen de abordaje nutricional (cuantas personas hay, y que es lo que tienen)
    */
    
    protected Integer cantPersonas;
    protected Integer[] edades, sexo;
    protected ArrayList<String> resumenProbSalud, resumenAbordNut;

    public ResumenFamilia() {}

    public void cargarResumenFamilia(ArrayList<Integrante>listaIntegrantes){
        Integer cantFem = 0 , cantMasc = 0;
        this.cantPersonas = listaIntegrantes.size();
        for (Integrante integrante : listaIntegrantes) {
            //Cuenta integrantes de cada sexo
            if(integrante.sexo.equalsIgnoreCase("masculino")){
                cantMasc += 1;
            }else
                cantFem += 1;
            
            
        }
    }
    
    
    
    
}
